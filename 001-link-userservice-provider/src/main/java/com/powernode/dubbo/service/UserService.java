package com.powernode.dubbo.service;

import com.powernode.dubbo.domain.User;

/**
 * @author laolu
 * @version 1.0
 * @date:2022-09-19 09:21
 */
public interface UserService {

    /**
     * 根据id 查询用户
     * @param id
     * @return
     */
    User getUserById(Integer id);

}
