package com.example.facebookminiclone.services;

import com.example.facebookminiclone.dto.CommentDto;
import com.example.facebookminiclone.entities.Comment;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CommentService {

    Comment createComment(CommentDto commentDto, Long postId, Long userId);

    List<Comment> findAllComment();

    Comment findById(Long id);

//    List<Comment> findCommentByPost(Long postId);

}
