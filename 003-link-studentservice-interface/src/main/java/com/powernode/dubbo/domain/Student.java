package com.powernode.dubbo.domain;

import java.io.Serializable;

/**
 * @author laolu
 * @version 1.0
 * @date:2022-09-19 11:39
 */
public class Student implements Serializable {
    private Integer id;

    private String name;

    private Integer age;

    public Student() {
    }

    public Student(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
