package com.example.facebookminiclone.controller;


import com.example.facebookminiclone.dto.UserDto;
import com.example.facebookminiclone.services.UserService;
import com.example.facebookminiclone.services.serviceImpl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/user") //localhost:8080/api/user/create-user
@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }


    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("users", userService.getAllUser());
        return "index";
    }

    @GetMapping("/create-user")
    public String showCreateUserForm(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "User";
    }

    @PostMapping("/create-user")
    public String createUser(@ModelAttribute("userDto") UserDto userDto) {
        System.out.println("this is the dto before " + userDto);
        userService.createUser(userDto);
        System.out.println("this is the dto after " + userDto);
        return "index";
    }
    @GetMapping("/home")
    public String showUpdateForm(Model model, UserDto userDto){
        model.addAttribute(
                "user", new UserDto()
        );
                return "updateform";
    }
    @PostMapping ("/update")
    public String updateUser(UserDto userDto){
        userDto.setName(userDto.getName());
        userDto.setEmail(userDto.getEmail());
        userDto.setPassword(userDto.getPassword());
        userService.createUser(userDto);
        return "redirect:/home";
    }

    @PostMapping("/delete")
    public String deleteById(Long id){
        userService.deleteUserById(id);
        return "redirect:/home";
    }

}
