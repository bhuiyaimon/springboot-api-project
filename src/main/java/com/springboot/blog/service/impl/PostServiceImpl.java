package com.springboot.blog.service.impl;
import com.springboot.blog.entity.Post;
import com.springboot.blog.playload.PostDto;
import com.springboot.blog.repository.PostRepository;
import com.springboot.blog.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{


    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createpost(PostDto postDto) {
        //convert DTO to entity
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        post.setDescription(postDto.getDescription());

        Post newpost = postRepository.save(post);
        //convert entity to DTO
        PostDto postresponse = new PostDto();
        postresponse.setId(newpost.getId());
        postresponse.setTitle(newpost.getTitle());
        postresponse.setContent(newpost.getContent());
        postresponse.setDescription(newpost.getDescription());



        return postresponse;
    }
}
