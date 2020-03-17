package com.soft1851.spring.ioc.entity;

import java.util.List;

/**
 * @Description TODO
 * @Author jl_huang
 * @Date 2020-03-17
 **/
public class Student {
    private Integer id;
    private Phone phone;
    private List<String> hobbies;

    public Student(Integer id, Phone phone, List<String> hobbies) {
        this.id = id;
        this.phone = phone;
        this.hobbies = hobbies;
    }
    public Student(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", phone=" + phone +
                ", hobbies=" + hobbies +
                '}';
    }
}