package com.songxl.springbootdva.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.*;

/**
 * @Auther: songxl
 * @Date: 2019-9-11 00:19
 * @Description:
 * @Version V1.0
 */
@RequestMapping("/get")
@Controller
public class GetRequestController {

    /**
     * 解决测试get请求中文乱码
     * @param request
     */
    @RequestMapping("/one")
    public void testGetRequest(HttpServletRequest request) {
        String name = request.getParameter("name");
        Map<String, String[]> parameterMap = request.getParameterMap();
        try {
            name = URLDecoder.decode(name, "UTF-8");
            System.out.println("name:" + name);
            System.out.println("get receive:" + parameterMap);

            List<String> list = Arrays.asList(parameterMap.get("age"));
            List<String> list1 = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                list1.add(URLDecoder.decode(list.get(i), "UTF-8"));
            }
            System.out.println("get All receive1:" + Arrays.asList(parameterMap.get("name")));
            System.out.println("get All receive2:" + Arrays.asList(parameterMap.get("age")));
            System.out.println("get All receive3:" + list1);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试get请求中发送数据
     *  request.getParameterMap() 接收所有请求，但是数据都是数组
     *  request.getParameterValues("age") 可以接收指定名称的数组
     *  request.getParameter("name"); 接收名称为name的参数
     * @param request
     */
    @RequestMapping("/two")
    public void testGetRequest2(HttpServletRequest request) {
        Map<String, String[]> parameterMap = request.getParameterMap();

        HashMap<String, String[]> map = new HashMap<>();
        try {
            String[] ages = parameterMap.get("age");
            String[] name = parameterMap.get("name");
            System.out.println(name[0]);
            for (String age : ages) {
                System.out.println("age:"+age);
            }

            Set<String> key = parameterMap.keySet();

            System.out.println(map);
            System.out.println(map.get("age"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/three")
    public void three(HttpServletRequest request){
    }
}
