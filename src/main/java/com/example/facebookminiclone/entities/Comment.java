package com.example.facebookminiclone.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity


    public class Comment {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long commentId;

       @Column(nullable = false,length=1000)
        private String content;

       @Column(nullable = false)
        private Timestamp timestamp;

       @ManyToOne
       private User user;

       @ManyToOne
       private Post post;
}
