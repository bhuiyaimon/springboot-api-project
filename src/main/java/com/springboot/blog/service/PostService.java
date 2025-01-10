package com.springboot.blog.service;

import com.springboot.blog.playload.PostDto;

public interface PostService {
    PostDto createpost(PostDto postDto);
}
