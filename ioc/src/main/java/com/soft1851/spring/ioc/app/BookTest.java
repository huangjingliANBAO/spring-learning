package com.soft1851.spring.ioc.app;

import com.soft1851.spring.ioc.entity.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @Description TODO
 * @Author jl_huang
 * @Date 2020-03-17
 **/
public class BookTest {
    public static void main(String[] args) {
        //生成基于注解配置的应用上下文对象
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        //手动开启扫包
        ctx.scan("com.soft1851.spring.ioc.config");
        ctx.refresh();
        Book book = (Book) ctx.getBean("book");
        book.setName("java");
        book.setPrice(88.8);
        System.out.println(book);
    }
}