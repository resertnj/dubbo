package com.powernode.dubbo.service.impl;

import com.powernode.dubbo.domain.Student;
import com.powernode.dubbo.service.StudentService;

/**
 * @author laolu
 * @version 1.0
 * @date:2022-09-19 14:42
 */
public class StudentServiceImpl implements StudentService {



    @Override
    public Student getStuById(Integer id) {
        Student student = new Student();
        student.setId(id);
        student.setName("θη");
        student.setAddr("εδΊ¬");
        return student;
    }
}
