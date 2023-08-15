package com.example.facebookminiclone.repositories;

import com.example.facebookminiclone.entities.Post;
import com.example.facebookminiclone.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

    List<Post> findPostsByUser(User user);
}
