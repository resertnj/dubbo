package com.powernode.dubbo.service;

import com.powernode.dubbo.domain.Student;

/**
 * @author laolu
 * @version 1.0
 * @date:2022-09-19 14:40
 */
public interface StudentService {


    /**
     * 根据id 查询学生信息
     * @param id
     * @return
     */
    Student getStuById(Integer id);

}
