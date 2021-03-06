package com.soft1851.spring.ioc.dao.impl;

import com.soft1851.spring.ioc.dao.PostDao;
import com.soft1851.spring.ioc.entity.Post;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class PostDaoImplTest {
    @Autowired
    private PostDao postDao;

    @Test
    public void insert() {
        byte[] tem= {'a','b'};
        Post post = Post.builder().forumId(1).content("测试1").thumbnail(tem).postTime(Timestamp.valueOf(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()))).title("test1").build();
        int n = postDao.insert(post);
        assertEquals(1,n);
        System.out.println(n);
    }

    @Test
    public void batchInsert() {
        byte[] tem= {'a','b'};
        String time = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new java.util.Date());
        Post[] posts = {
                Post.builder().forumId(3).content("测试1").thumbnail(tem).postTime(Timestamp.valueOf(time)).title("test1").build(),
                Post.builder().forumId(3).content("测试2").thumbnail(tem).postTime(Timestamp.valueOf(time)).title("test2").build(),
                Post.builder().forumId(3).content("测试3").thumbnail(tem).postTime(Timestamp.valueOf(time)).title("test3").build(),
                Post.builder().forumId(3).content("测试4").thumbnail(tem).postTime(Timestamp.valueOf(time)).title("test4").build(),
        };
        List<Post> postList = Arrays.asList(posts);
        int[] rows = postDao.batchInsert(postList);
        assertEquals(4,rows.length);
    }

    @Test
    public void batchDelete() {
        int[] tem = {1,2,3};
        int[] rows = postDao.batchDelete(tem);
        assertEquals(3,rows.length);
    }

    @Test
    public void delete() {
        int n = postDao.delete(21);
        assertEquals(1,n);
    }

    @Test
    public void selectByWords() {
        List<Post> postList = postDao.selectWords("1");
        postList.forEach(item -> System.out.println(item.getPostId()));
    }

    @Test
    public void countPostByForumId() {
        int n = postDao.countPostByForumId(3);
        System.out.println(n);
    }
}