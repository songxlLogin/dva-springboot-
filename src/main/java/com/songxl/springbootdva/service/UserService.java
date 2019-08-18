package com.songxl.springbootdva.service;

import com.songxl.springbootdva.model.Result;
import com.songxl.springbootdva.model.UserDO;

import java.util.List;

/**
 * Created by 47070_000 on 2018/7/25.
 */
public interface UserService {

    List<UserDO> queryAll();

    UserDO queryById(Integer id);

    Result removeUser(Integer id);

    Result registerUser(UserDO userDO);

    Result updateUser(UserDO userDO);

}
