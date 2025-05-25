package com.example.demo.model;

public class Post {
    private String text;
    private Integer likes = 0;

    public Post(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }
}
