package com.songxl.springbootdva.dao;



import com.songxl.springbootdva.model.UserDO;

import java.util.List;

public interface UserDAO {
    List<UserDO> queryAll();

    UserDO queryById(Integer id);

    void removeUser(Integer id);

    void registerUser(UserDO userDO);

    void updateUser(UserDO userDO);
}
