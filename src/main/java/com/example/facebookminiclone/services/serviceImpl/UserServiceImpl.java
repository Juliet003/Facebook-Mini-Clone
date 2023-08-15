package com.example.facebookminiclone.services.serviceImpl;

import com.example.facebookminiclone.dto.UserDto;
import com.example.facebookminiclone.entities.User;
import com.example.facebookminiclone.repositories.UserRepository;
import com.example.facebookminiclone.services.UserService;
import org.springframework.stereotype.Service;


import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User createUser(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        User user1 = userRepository.save(user);
        return user1;
    }

    @Override
    public User findById(Long id) {
        Optional<User>optionalUser =userRepository.findById(id);
        return optionalUser.get();
    }
    @Override
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
    @Override
    public void deleteUserById(Long id){
        userRepository.deleteById(id);
    }
}
