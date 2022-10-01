package com.powernode.dubbo.service.impl;

import com.powernode.dubbo.domain.Student;
import com.powernode.dubbo.service.StudentService;

/**
 * @author laolu
 * @version 1.0
 * @date:2022-09-19 16:27
 */
public class StudentServiceImpl2 implements StudentService {
    @Override
    public Student getStuById(Integer id) {
        Student student = new Student();
        student.setId(1002);
        student.setName("老李");
        student.setAddr("滁州");

        return student;
    }
}
