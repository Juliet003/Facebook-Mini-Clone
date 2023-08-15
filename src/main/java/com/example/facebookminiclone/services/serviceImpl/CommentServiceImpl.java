package com.example.facebookminiclone.services.serviceImpl;

import com.example.facebookminiclone.dto.CommentDto;
import com.example.facebookminiclone.entities.Comment;
import com.example.facebookminiclone.entities.Post;
import com.example.facebookminiclone.repositories.CommentRepository;
import com.example.facebookminiclone.repositories.PostRepository;
import com.example.facebookminiclone.services.CommentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    public CommentServiceImpl(CommentRepository commentRepository, PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }

    @Override
    public Comment createComment(CommentDto commentDto, Long postId, Long userId) {
    Comment comment = new Comment();
    comment.setContent(commentDto.getContent());
    Comment comment1 = commentRepository.save(comment);
        return comment1;
    }

    @Override
    public List<Comment> findAllComment() {
    List<Comment> comments = commentRepository.findAll();
        return comments;
    }

    @Override
    public Comment findById(Long id) {
       Optional<Comment> optionalComment= commentRepository.findById(id);
        return optionalComment.get();
    }
//
//    @Override
//    public List<Comment> findCommentByPost(Long postId) {
//        Optional<Post>postOptional = postRepository.findById(postId);
//      //  List<Comment>commentList = commentRepository.findCommentsByPost_PostId();
//        return commentList;
//    }
}
