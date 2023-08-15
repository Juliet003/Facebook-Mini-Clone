package com.example.facebookminiclone.entities;

import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="likes")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long likeId;

    //@Column(nullable=true)
    //private Long userId;
    @ManyToOne
    private  User user;

    @ManyToOne
    private Post post;

}
