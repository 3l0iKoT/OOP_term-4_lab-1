package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    private final List<Post> posts;

    // Блок инициализации для первоначального наполнения списка
    {
        posts = new ArrayList<>();
        posts.add(new Post(0L,"Первый пост", new Date()));
        posts.add(new Post(1L,"Второй пост", new Date()));
        posts.add(new Post(2L,"Третий пост", new Date()));
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post((long) posts.size(),text, new Date()));
    }
}
