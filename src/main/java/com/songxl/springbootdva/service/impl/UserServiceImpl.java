package com.songxl.springbootdva.service.impl;

import com.songxl.springbootdva.dao.UserDAO;
import com.songxl.springbootdva.model.Result;
import com.songxl.springbootdva.model.UserDO;
import com.songxl.springbootdva.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource(name = "userDAO")
    private UserDAO userDAO;

    @Override
    public List<UserDO> queryAll() {
        return userDAO.queryAll();
    }

    @Override
    public UserDO queryById(Integer id) {
        return userDAO.queryById(id);
    }

    @Override
    public Result removeUser(Integer id) {
        Result result = new Result();
        try {
            userDAO.removeUser(id);
            result.setSuccess(true);
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }

    @Override
    public Result registerUser(UserDO userDO) {
        Result result = new Result();
        try {
            userDAO.registerUser(userDO);
            result.setSuccess(true);
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }

    @Override
    public Result updateUser(UserDO userDO) {
        Result result = new Result();
        try {
            userDAO.updateUser(userDO);
            result.setSuccess(true);
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }
}
