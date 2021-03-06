package com.soft1851.spring.ioc.dao.impl;

import com.soft1851.spring.ioc.config.JDBCConfig;
import com.soft1851.spring.ioc.dao.ForumDao;
import com.soft1851.spring.ioc.entity.Forum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JDBCConfig.class)
public class ForumDaoImplTest {

    @Autowired
    private ForumDao forumDao;

    @Test
    public void insert() {
        Forum forum = Forum.builder().forumName("测试论坛").build();
        int n = forumDao.insert(forum);
        assertEquals(1,n);
    }

    @Test
    public void batchInsert() {
        Forum[] forums = {Forum.builder().forumName("测试论坛1").build(),
                Forum.builder().forumName("测试论坛2").build(),
                Forum.builder().forumName("测试论坛3").build()
        };
        List<Forum> forumList = Arrays.asList(forums);
        int[] rows = forumDao.batchInsert(forumList);
        assertEquals(2,rows.length);
    }

    @Test
    public void delete() {
        int n = forumDao.delete(10);
        assertEquals(1,n);
    }

    @Test
    public void update() {
        Forum forum = forumDao.get(11);
        forum.setForumName("修改论坛测试的新名称");
        int n = forumDao.update(forum);
        assertEquals(1,n);
    }

    @Test
    public void get() {
        Forum forum = forumDao.get(12);
        System.out.println(forum);
    }

    @Test
    public void selectAll() {
        List<Forum> forums = forumDao.selectAll();
      forums.forEach(System.out::println);
    }
}