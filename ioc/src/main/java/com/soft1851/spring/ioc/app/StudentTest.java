package com.soft1851.spring.ioc.app;

import com.soft1851.spring.ioc.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Author jl_huang
 * @Date 2020-03-17
 **/
public class StudentTest {
    private static Logger logger = LoggerFactory.getLogger(StudentTest.class);
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) ac.getBean("student");
        logger.info(student.toString());
    }
}