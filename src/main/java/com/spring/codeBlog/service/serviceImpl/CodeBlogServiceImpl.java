package com.spring.codeBlog.service.serviceImpl;

import com.spring.codeBlog.model.Post;
import com.spring.codeBlog.repository.CodeBlogRepository;
import com.spring.codeBlog.service.CodeBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeBlogServiceImpl implements CodeBlogService {

    //Injeção de dependência do repositório
    @Autowired
    CodeBlogRepository codeBlogRepository;


    @Override
    public List<Post> FindAll() {
        return codeBlogRepository.findAll();
    }

    @Override
    public Post FindById(long id) {
        return codeBlogRepository.findById(id).get();
    }

    @Override
    public Post Save(Post post) {
        return codeBlogRepository.save(post);
    }
}
