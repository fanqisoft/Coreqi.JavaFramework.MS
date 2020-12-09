package cn.coreqi.db.service;

import cn.coreqi.db.domain.TUser;

import java.util.List;

public interface TUserService {
    List<Integer> getRoleIdsByUserId(Integer userId);
    List<TUser> getUsersByUserName(String userName);
}
