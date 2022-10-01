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
 * @date:2022-09-19 14:56
 */

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getStuById")
    @ResponseBody
    public Student getStuById(Integer id) {
        return studentService.getStuById(id);
    }
}
