package com.soft1851.spring.ioc.app;

import com.soft1851.spring.ioc.entity.Phone;
import com.soft1851.spring.ioc.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author jl_huang
 * @Date 2020-03-17
 **/
public class StudentTest {
    private static Logger logger = LoggerFactory.getLogger(StudentTest.class);
    public static void main(String[] args) {
        AnnotationConfigApplicationContext act = new AnnotationConfigApplicationContext();
        act.scan("com.soft1851.spring.ioc.config");
        act.refresh();
        Student student = (Student) act.getBean("student");
        student.setId(1);
        Phone phone = (Phone) act.getBean("phone");
        phone.setBrand("小米");
        phone.setPrice(1999.00);
        student.setPhone(phone);
        List<String> list = new ArrayList<>();
        list.add("睡觉");
        list.add("学习");
        student.setHobbies(list);
        System.out.println(student);
    }
}