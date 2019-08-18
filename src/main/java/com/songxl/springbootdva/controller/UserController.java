package com.songxl.springbootdva.controller;

import com.songxl.springbootdva.model.Result;
import com.songxl.springbootdva.model.UserDO;
import com.songxl.springbootdva.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: sxl
 * @Date: 2019-7-27 10:59
 * @Description:
 * @Version V1.0
 */
@CrossOrigin
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryAll")
    @ResponseBody
    public List<UserDO> queryUser(){
        System.out.println("come in sxl...");
        return userService.queryAll();
    }

    @RequestMapping("/add")
    public Result add(UserDO userDO){
        Result result = userService.registerUser(userDO);
        return result;
    }

    @RequestMapping("/modify")
    public Result change(UserDO u){
        Result result = userService.updateUser(u);
        return result;
    }

    @RequestMapping("/delete")
    public Result delete( Integer id){
        Result result = userService.removeUser(id);
        return result;
    }

    @RequestMapping("/testModel")
    public Map testModel(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("sxl","你一定可以完成任务");
        return map;
    }
}
