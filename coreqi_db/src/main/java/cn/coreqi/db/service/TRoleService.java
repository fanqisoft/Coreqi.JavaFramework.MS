package cn.coreqi.db.service;

import cn.coreqi.db.domain.TRole;

import java.util.List;
import java.util.Set;

public interface TRoleService {
    Set<TRole> queryByIds(List<Integer> ids);
}
