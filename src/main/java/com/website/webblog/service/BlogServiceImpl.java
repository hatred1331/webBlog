package com.website.webblog.service;

import com.website.webblog.models.Post;
import com.website.webblog.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogServiceImpl implements BlogService{
    private final PostRepository postRepository;

    @Autowired
    public BlogServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> findAllPosts() {
        List<Post> posts = (List<Post>) postRepository.findAll();
        return posts;
    }
}
