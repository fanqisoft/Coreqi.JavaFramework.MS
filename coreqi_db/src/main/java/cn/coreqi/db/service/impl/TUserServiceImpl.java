package cn.coreqi.db.service.impl;

import cn.coreqi.db.dao.TUserMapper;
import cn.coreqi.db.dao.TUserRoleMapper;
import cn.coreqi.db.domain.*;
import cn.coreqi.db.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TUserServiceImpl implements TUserService {

    @Autowired
    private TUserMapper userMapper;

    @Autowired
    private TUserRoleMapper userRoleMapper;

    @Override
    public List<Integer> getRoleIdsByUserId(Integer userId) {
        TUserRoleExample userRoleExample = new TUserRoleExample();
        TUserRoleExample.Criteria criteria = userRoleExample.createCriteria();
        criteria.andUseridEqualTo(userId);
        List<TUserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        return userRoles.stream().map(ur -> ur.getRid()).collect(Collectors.toList());
    }

    @Override
    public List<TUser> getUsersByUserName(String userName) {
        TUserExample userExample = new TUserExample();
        userExample.createCriteria().andUsernameEqualTo(userName);
        List<TUser> userList = userMapper.selectByExample(userExample);
        return userList;
    }


}
