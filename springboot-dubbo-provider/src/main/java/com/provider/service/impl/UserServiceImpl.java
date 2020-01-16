package com.provider.service.impl;

import com.dubbo.bean.UserBean;
import com.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: zhanghui
 * @Date: 2020/1/15
 * @Description: com.provider.service.impl
 * @version: 1.0
 */

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<UserBean> getUserById(Integer id) {
        UserBean user = new UserBean(1,"张三","男",20);
        return Arrays.asList(user);
    }
}
