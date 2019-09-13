package com.songxl.springbootdva.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @Auther: songxl
 * @Date: 2019-9-11 00:19
 * @Description:
 * @Version V1.0
 */
@RequestMapping("/get")
@Controller
public class GetRequestController {

    @RequestMapping("/one")
    public void testGetRequest(HttpServletRequest request){
        String name = request.getParameter("name");
        Map<String, String[]> parameterMap = request.getParameterMap();
        try {
            name = URLDecoder.decode(name, "UTF-8");
            System.out.println("name:"+name);
            System.out.println("get receive:"+parameterMap);

            List<String> list = Arrays.asList(parameterMap.get("age"));
            List<String> list1 = new ArrayList<>();
            for(int i=0;i<list.size();i++){
                list1.add( URLDecoder.decode(list.get(i), "UTF-8"));
            }
            System.out.println("get All receive1:"+ Arrays.asList(parameterMap.get("name")));
            System.out.println("get All receive2:"+Arrays.asList(parameterMap.get("age")));
            System.out.println("get All receive3:"+ list1);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
