package com.website.webblog.service;

import com.website.webblog.models.Post;

import java.util.List;

public interface BlogService {
    List<Post>  findAllPosts();
}
