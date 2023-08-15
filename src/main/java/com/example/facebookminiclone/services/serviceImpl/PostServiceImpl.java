package com.example.facebookminiclone.services.serviceImpl;

import com.example.facebookminiclone.dto.PostDto;
import com.example.facebookminiclone.entities.Post;
import com.example.facebookminiclone.entities.User;
import com.example.facebookminiclone.repositories.PostRepository;
import com.example.facebookminiclone.repositories.UserRepository;
import com.example.facebookminiclone.services.PostService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    private final UserRepository userRepository;

    public PostServiceImpl(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Post createPost(PostDto postDto) {
        Post post = new Post();
        post.setContent(postDto.getContent());
        Post post1 = postRepository.save(post);
        return post1;
    }

    @Override
    public List<Post> findAllPost() {
        List<Post> posts = postRepository.findAll();
        return posts;
    }

    @Override
    public Post findById(Long id) {
        Optional<Post> optionalPost = postRepository.findById(id);
        return optionalPost.get();
    }

    @Override
    public List<Post> findPostByUser(Long userId){
      Optional<User> user= userRepository.findById(userId);
      List<Post> userPosts = postRepository.findPostsByUser(user.get());
        return userPosts ;
    }
}
