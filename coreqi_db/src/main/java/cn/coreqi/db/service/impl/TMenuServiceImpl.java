package cn.coreqi.db.service.impl;

import cn.coreqi.db.dao.TMenuMapper;
import cn.coreqi.db.dao.TMenuRoleMapper;
import cn.coreqi.db.domain.TMenu;
import cn.coreqi.db.domain.TMenuExample;
import cn.coreqi.db.domain.TMenuRole;
import cn.coreqi.db.domain.TMenuRoleExample;
import cn.coreqi.db.service.TMenuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TMenuServiceImpl implements TMenuService {

    @Autowired
    private TMenuRoleMapper menuRoleMapper;

    @Autowired
    private TMenuMapper menuMapper;

    @Override
    public Set<TMenu> queryByRoleIds(List<Integer> roleIds) {
        TMenuRoleExample menuRoleExample = new TMenuRoleExample();
        menuRoleExample.createCriteria().andRidIn(roleIds);
        List<TMenuRole> menuRoles = menuRoleMapper.selectByExample(menuRoleExample);
        TMenuExample menuExample = new TMenuExample();
        menuExample.createCriteria().andIdIn(menuRoles.stream().map(mr -> mr.getMid()).collect(Collectors.toList()));
        List<TMenu> menus = menuMapper.selectByExample(menuExample);
        return menus.stream().collect(Collectors.toSet());
    }
}
