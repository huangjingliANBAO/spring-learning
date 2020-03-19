package com.soft1851.spring.ioc.app;

import com.soft1851.spring.ioc.config.JDBCConfig;
import com.soft1851.spring.ioc.dao.ForumDao;
import com.soft1851.spring.ioc.entity.Forum;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @Description TODO
 * @Author jl_huang
 * @Date 2020-03-19
 **/
public class JDBCTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext act = new AnnotationConfigApplicationContext(JDBCConfig.class);
        //手动开启扫包
        act.scan("com.soft1851.spring.ioc.config");
        //ctx.refresh();
        JdbcTemplate jdbcTemplate = (JdbcTemplate) act.getBean("jdbcTemplate");
        System.out.println(jdbcTemplate);
        ForumDao forumDao = (ForumDao) act.getBean("forumDao");
        List<Forum> forumList = forumDao.selectAll();
        System.out.println(forumList);




        }
}