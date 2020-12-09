package cn.coreqi.api.shiro;


import cn.coreqi.db.domain.TMenu;
import cn.coreqi.db.domain.TRole;
import cn.coreqi.db.domain.TUser;
import cn.coreqi.db.service.TMenuService;
import cn.coreqi.db.service.TRoleService;
import cn.coreqi.db.service.TUserService;
import cn.coreqi.db.util.bcrypt.BCryptPasswordEncoder;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AdminAuthorizingRealm extends AuthorizingRealm {

    @Autowired
    private TUserService userService;

    @Autowired
    private TRoleService roleService;

    @Autowired
    private TMenuService menuService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        if (principals == null) {
            throw new AuthorizationException("PrincipalCollection method argument cannot be null.");
        }

        TUser admin = (TUser) getAvailablePrincipal(principals);

        List<Integer> roleIds = userService.getRoleIdsByUserId(admin.getId());
        Set<TRole> roles = roleService.queryByIds(roleIds);
        Set<TMenu> permissions = menuService.queryByRoleIds(roleIds);
        //Set<String> permissions = permissionService.queryByRoleIds(roleIds);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setRoles(roles.stream().map(r -> r.getName()).collect(Collectors.toSet()));
        info.setStringPermissions(permissions.stream().map(m -> m.getName()).collect(Collectors.toSet()));
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        String username = upToken.getUsername();
        String password = new String(upToken.getPassword());

        if (!StringUtils.hasLength(username)) {
            throw new AccountException("用户名不能为空");
        }
        if (!StringUtils.hasLength(password)) {
            throw new AccountException("密码不能为空");
        }
        List<TUser> userList = userService.getUsersByUserName(username);
        Assert.state(userList.size() < 2, "同一个用户名存在两个账户");
        if (userList.size() == 0) {
            throw new UnknownAccountException("找不到用户（" + username + "）的帐号信息");
        }
        TUser admin = userList.get(0);

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if (!encoder.matches(password, admin.getPassword())) {
            throw new UnknownAccountException("找不到用户（" + username + "）的帐号信息");
        }

        return new SimpleAuthenticationInfo(admin, password, getName());
    }

}
