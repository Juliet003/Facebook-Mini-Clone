package com.example.facebookminiclone.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;


    @ManyToOne
    private User user;

   @Column(nullable = false,length  =1000)
    private String content;

    @Column(nullable = false)
    private Timestamp timestamp;

    @OneToMany(mappedBy="post")
    private List<Comment> comment;

    @OneToMany(mappedBy = "post")
    private List<Like> likes;

}
