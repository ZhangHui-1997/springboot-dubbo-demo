package com.dubbo.service;

import com.dubbo.bean.UserBean;

import java.util.List;

/**
 * @Auther: zhanghui
 * @Date: 2020/1/15
 * @Description: com.dubbo.service
 * @version: 1.0
 */

public interface UserService {

    //通过id获取用户信息
    List<UserBean> getUserById(Integer id);
}
