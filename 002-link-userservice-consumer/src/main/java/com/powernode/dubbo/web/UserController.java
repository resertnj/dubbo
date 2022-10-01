package com.powernode.dubbo.web;

import com.powernode.dubbo.domain.User;
import com.powernode.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author laolu
 * @version 1.0
 * @date:2022-09-19 10:11
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUserById")
    @ResponseBody
    public User getUserById(Integer id) {
        System.out.println("进入到Contrller类");
        User user = userService.getUserById(id);
        return user;
    }
}
