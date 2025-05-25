package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("Это первый пост! Привет!"));
        posts.add(new Post("Я сдал комиссию по ООП!"));
        posts.add(new Post("Как дела?"));
        return posts;
    }
}
