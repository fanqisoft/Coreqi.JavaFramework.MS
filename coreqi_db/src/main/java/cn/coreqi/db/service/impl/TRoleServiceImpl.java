package cn.coreqi.db.service.impl;

import cn.coreqi.db.dao.TRoleMapper;
import cn.coreqi.db.domain.TRole;
import cn.coreqi.db.domain.TRoleExample;
import cn.coreqi.db.service.TRoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TRoleServiceImpl implements TRoleService {

    @Autowired
    private TRoleMapper roleMapper;

    @Override
    public Set<TRole> queryByIds(List<Integer> ids) {
        TRoleExample example = new TRoleExample();
        example.createCriteria().andIdIn(ids);
        return roleMapper.selectByExample(example).stream().collect(Collectors.toSet());
    }
}
