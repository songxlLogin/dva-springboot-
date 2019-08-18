package com.songxl.springbootdva.controller;

import com.songxl.springbootdva.model.Result;
import com.songxl.springbootdva.model.UserDO;
import com.songxl.springbootdva.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryAll")
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

    /**
     * 仅作参考使用：一般都用不到，一般都不会在选择玩文件之后就上传，
     *  而是选择上传文件以及填写一些数据之后，一起封装在formData中上传到后端服务器，应参考下面（ uploadWord）的 例子。
     * @param file
     * @return
     */
    @RequestMapping("/uploadWord")
    public Result uploadWord(@RequestParam("file") MultipartFile file){
        Result result = new Result();
        System.out.println("receive:"+file.getOriginalFilename());
        System.out.println("receive:"+file.getSize());
        result.setSuccess(true);
        return result;
    }

    /**
     * 使用form表单提交的数据在后端接收
     * @param name
     * @param files
     * @return
     */
    @RequestMapping("/mockAddUser")
    public Result uploadWord( @RequestParam("name")String name,@RequestParam("files") MultipartFile[] files){
        Result result = new Result();
        System.out.println("request name:"+name);
        if(files.length>0){
            String originalFilename = files[0].getOriginalFilename();
            System.out.println(originalFilename);
        }
        result.setSuccess(true);
        return result;
    }

}
