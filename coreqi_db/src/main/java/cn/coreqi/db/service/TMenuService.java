package cn.coreqi.db.service;

import cn.coreqi.db.domain.TMenu;

import java.util.List;
import java.util.Set;

public interface TMenuService {
    Set<TMenu> queryByRoleIds(List<Integer> roleIds);
}
