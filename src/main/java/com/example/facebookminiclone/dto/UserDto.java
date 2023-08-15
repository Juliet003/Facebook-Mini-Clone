package com.example.facebookminiclone.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UserDto {
    private String name;
    private String email;
    private String password;
}

