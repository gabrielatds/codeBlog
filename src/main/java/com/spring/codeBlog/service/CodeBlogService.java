package com.spring.codeBlog.service;

import com.spring.codeBlog.model.Post;

import java.util.List;

public interface CodeBlogService {

    List<Post> FindAll();
    Post FindById(long id);
    Post Save(Post post);
}
