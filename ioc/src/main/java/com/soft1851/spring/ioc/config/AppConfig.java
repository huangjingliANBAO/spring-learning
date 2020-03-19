package com.soft1851.spring.ioc.config;

import com.soft1851.spring.ioc.entity.Book;
import com.soft1851.spring.ioc.entity.Phone;
import com.soft1851.spring.ioc.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;


@Configuration
public class AppConfig {
    @Bean
    public Book book(){
        return new Book();
    }
    @Bean
    public Student student(){
        return new Student();
    }
    @Bean
    public Phone phone(){
        return new Phone();
    }
    @Bean
    public List<String> stringList(){
        List<String> stringList = new ArrayList<>();
        stringList.add("小米");
        stringList.add("苹果");
        stringList.add("华为");
        stringList.add("魅族");
        return stringList;
    }
    @Bean
    public Set<Integer> integerSet(){
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(2);
        integerSet.add(4);
        integerSet.add(1);
        integerSet.add(3);
        return integerSet;
    }
    @Bean
    public Map<String,String> stringMap(){
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("中国","北京");
        stringMap.put("美国","华盛顿");
        stringMap.put("英国","伦敦");
        return stringMap;
    }

}