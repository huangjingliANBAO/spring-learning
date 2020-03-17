package com.soft1851.spring.ioc.dao;

import com.soft1851.spring.ioc.entity.Post;

import java.util.List;

/**
 * @Description TODO
 * @Author jl_huang
 * @Date 2020-03-17
 **/
public interface PostDao {
    /**
     * 新增Post
     * @param post
     * @return
     */
    int insert(Post post);

    /**
     * 批量新增
     * @param posts
     * @return
     */
    int[] batchInsert(List<Post> posts);

    /**
     * 批量删除
     * @param postId
     * @return
     */
    int[] batchDelete(int[] postId);

    /**
     * 根据id删除postId
     * @param postId
     * @return
     */
    int delete(int postId);


    /**
     * 根据id查询postId
     * @param postId
     * @return
     */
    Post get(int postId);

    /**
     * 根据关键字查询
     * @param words
     * @return
     */
    List<Post> selectWords(String words);

    /**
     * 统计帖子总数
     * @param forumId
     * @return
     */
    int countPostByForumId(int forumId);

}
