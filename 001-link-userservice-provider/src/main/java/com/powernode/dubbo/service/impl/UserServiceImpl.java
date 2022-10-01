package com.powernode.dubbo.service.impl;

import com.powernode.dubbo.domain.User;
import com.powernode.dubbo.service.UserService;

/**
 * @author laolu
 * @version 1.0
 * @date:2022-09-19 09:24
 */
public class UserServiceImpl implements UserService {


    @Override
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("老张");
        user.setAddr("南京");
        return user;
    }
}
