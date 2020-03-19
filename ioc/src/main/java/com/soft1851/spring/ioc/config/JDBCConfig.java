package com.soft1851.spring.ioc.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.soft1851.spring.ioc.dao.ForumDao;
import com.soft1851.spring.ioc.dao.impl.ForumDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Description TODO
 * @Author jl_huang
 * @Date 2020-03-19
 **/
@Configuration
@ComponentScan("com.soft1851.spring.ioc")
public class JDBCConfig {
    /**
     * 数据连接池地址配置
     * @return druidDataSource
     */
    @Bean
    public DruidDataSource druidDataSource(){
        DruidDataSource druidDataSource = new  DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/db_bbs?useUnicode=true&characterEncoding=utf8&useSSL=false&autoReconnect=true");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");
        return druidDataSource;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(DruidDataSource druidDataSource){
        return new   JdbcTemplate(druidDataSource);
    }
    @Bean
    public ForumDao forumDao(JdbcTemplate jdbcTemplate) {
        return new ForumDaoImpl(jdbcTemplate);
    }
}