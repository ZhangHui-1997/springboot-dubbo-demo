package com.consumer.controller;

import com.dubbo.bean.UserBean;
import com.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: zhanghui
 * @Date: 2020/1/15
 * @Description: com.consumer
 * @version: 1.0
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/getUser")
    public List<UserBean> getUser(@RequestParam("id")Integer id){
        List<UserBean> user = userService.getUserById(id);
        return user;
    }

}
