package com.example.facebookminiclone.services;

import com.example.facebookminiclone.dto.PostDto;
import com.example.facebookminiclone.entities.Post;
import com.example.facebookminiclone.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface PostService {
    Post createPost(PostDto postDto) ;

    List<Post> findAllPost();

    Post findById(Long id);

    List<Post> findPostByUser(Long userId);
}
