package com.example.facebookminiclone.services;

import com.example.facebookminiclone.dto.UserDto;
import com.example.facebookminiclone.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
     User createUser(UserDto userDto);

     User findById(Long id);

     List<User> getAllUser();

     void deleteUserById(Long id);
}


