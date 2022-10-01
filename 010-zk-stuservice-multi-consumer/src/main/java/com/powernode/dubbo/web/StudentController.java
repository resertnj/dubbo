package com.powernode.dubbo.web;

import com.powernode.dubbo.domain.Student;
import com.powernode.dubbo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author laolu
 * @version 1.0
 * @date:2022-09-19 16:38
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService1;

    @Autowired
    private StudentService studentService2;

    @GetMapping("/getStuById1")
    @ResponseBody
    public Student getStuById1(Integer id) {
        return studentService1.getStuById(id);
    }

    @GetMapping("/getStuById2")
    @ResponseBody
    public Student getStuById2(Integer id) {
        return studentService2.getStuById(id);
    }

}
