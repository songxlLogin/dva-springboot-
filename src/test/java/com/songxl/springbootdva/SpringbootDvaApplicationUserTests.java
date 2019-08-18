package com.songxl.springbootdva;

import com.songxl.springbootdva.model.UserDO;
import com.songxl.springbootdva.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDvaApplicationUserTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private UserService userService;

    @Test
    public void testQuery(){
        System.out.println("sxl test:"+userService);
        System.out.println(userService.queryAll());
    }

    @Test
    public void add(){
        UserDO userDO = new UserDO();
        userDO.setAge(24);
        userDO.setGender("女");
        userDO.setPassword("12345");
        userDO.setUsername("恁多");
        userService.registerUser(userDO);
    }

    @Test
    public void change(){
        UserDO userDO = userService.queryById(4);
        userDO.setPassword("1111111");
        userService.updateUser(userDO);
    }

    @Test
    public void delete(){
        userService.removeUser(4);
    }
}
