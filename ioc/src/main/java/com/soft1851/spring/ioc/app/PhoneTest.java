package com.soft1851.spring.ioc.app;

import com.soft1851.spring.ioc.entity.Phone;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description TODO
 * @Author jl_huang
 * @Date 2020-03-19
 **/
public class PhoneTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext act = new AnnotationConfigApplicationContext();
        act.scan("com.soft1851.spring.ioc");
        act.refresh();
       Phone phone = (Phone) act.getBean("phone");
       phone.setBrand("小米");
       phone.setPrice(1999.00);
        System.out.println(phone);
    }
}