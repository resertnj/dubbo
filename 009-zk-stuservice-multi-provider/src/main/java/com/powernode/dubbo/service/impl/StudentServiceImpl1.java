package com.powernode.dubbo.service.impl;

import com.powernode.dubbo.domain.Student;
import com.powernode.dubbo.service.StudentService;

/**
 * @author laolu
 * @version 1.0
 * @date:2022-09-19 16:25
 */
public class StudentServiceImpl1 implements StudentService {



    @Override
    public Student getStuById(Integer id) {
        Student stu = new Student();
        stu.setId(1001);
        stu.setName("老张");
        stu.setAddr("马鞍山");


        return stu;
    }
}
