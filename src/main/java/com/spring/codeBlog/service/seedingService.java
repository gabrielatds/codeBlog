package com.spring.codeBlog.service;

import com.spring.codeBlog.model.Post;
import com.spring.codeBlog.repository.CodeBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class seedingService {

    @Autowired
    CodeBlogRepository codeBlogRepository;

    @PostConstruct
    public  void seed(){
        List<Post> postList = new ArrayList<>();

        Post post1 = new Post();
        post1.setAutor("Gabriel Alves");
        post1.setData(LocalDate.now());
        post1.setTitulo("TESTE");
        post1.setTexto("TESTE TESTETESTETESTETESTETESTETESTETESTETESTETESTE");

        Post post2 = new Post();
        post2.setAutor("Camila Alves");
        post2.setData(LocalDate.now());
        post2.setTitulo("TESTE");
        post2.setTexto("TESTE TESTETESTETESTETESTETESTETESTETESTETESTETESTE");

        postList.add(post1);
        postList.add((post2));

        for(Post post: postList){
            Post savedPost = codeBlogRepository.save(post);
            System.out.println(savedPost.getId());
        }
    }
}
