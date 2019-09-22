package com.songxl.springbootdva.controller;

import com.songxl.springbootdva.model.Result;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: songxl
 * @Date: 2019-8-31 18:42
 * @Description:
 * @Version V1.0
 */
@RestController
@CrossOrigin
@RequestMapping("/checkbox")
public class CheckboxController {

    @RequestMapping("/single")
    public Result test(HttpServletRequest request){
        String name = request.getParameter("name");
//        System.out.println("receive:"+name);
        Result result = new Result();
        result.setSuccess(true);
        return result;
    }

    /**
     * 结论：
     * 1、request.getParameter的返回值就是string，如果传过来多个，就只能接收第一个
     * 2、如果想要接收数组C
     * @param request
     * @return
     */
    @RequestMapping("/multiply")
    public Result test2(HttpServletRequest request){
        String[] names = request.getParameterValues("name");
        System.out.println("receive array:"+names.length);
        System.out.println("receive array:"+names[0]+","+names[1]);
        Result result = new Result();
        result.setSuccess(true);
        return result;
    }
}
