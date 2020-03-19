package com.soft1851.spring.ioc.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Description TODO
 * @Author jl_huang
 * @Date 2020-03-19
 **/
public class LSMTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext act = new AnnotationConfigApplicationContext();
        act.scan("com.soft1851.spring.ioc");
        act.refresh();
        List<String> stringList = (List<String>) act.getBean("stringList");
        Set<Integer> integerSet = (Set<Integer>) act.getBean("integerSet");
        Map<String,String> stringMap = (Map<String, String>) act.getBean("stringMap");

        System.out.println(stringList);
        System.out.println(integerSet);
        System.out.println(stringMap);
    }
}