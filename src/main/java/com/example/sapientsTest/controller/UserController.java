package com.example.sapientsTest.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.sapientsTest.model.User;
import com.example.sapientsTest.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("/user")
    public List<User> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return users;
    }

    @GetMapping("/user/")
    public List<User> getUsersByParams(@RequestParam String param) {
        List<User> users = userService.getUsersByParam(param);
        return users;
        
    }

    @GetMapping("/user/userId")
    public List<User> getUsersById(@RequestParam String userId) {
        List<User> users = userService.getAllUsersById(userId);
       
        return users;
    }
    

    @GetMapping("/user/userByEmail")
    public List<User> getUsersByEmail(@RequestParam String email) {
        List<User> users = userService.getAllUsersByEmail(email);
       
        return users;
    }
    

}
