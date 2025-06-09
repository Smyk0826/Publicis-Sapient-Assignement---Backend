package com.example.sapientsTest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.sapientsTest.model.User;
import com.example.sapientsTest.model.UserResponse;

@Service
public class UserService {
    
    RestTemplate restTemplate;
    List<User> users;

    public String Url = "https://dummyjson.com/users";

    //get All Users
    public List<User> getAllUsers() {
        restTemplate = new RestTemplate();
        UserResponse userResponse = restTemplate.exchange(
            Url,
            org.springframework.http.HttpMethod.GET,
            null,
            new org.springframework.core.ParameterizedTypeReference<UserResponse>() {}
        ).getBody();
        users = userResponse != null ? userResponse.getUsers() : new ArrayList<>();

        System.out.println("Users fetched: " + users);
        return users;
    }

    //get Users by param/ Search Text
     public List<User> getUsersByParam(String param) {
        List<User> allUsers = (users == null)?getAllUsers():users;
        List<User> filteredUsers = allUsers.stream()
                .filter(user -> (user.getFirstName().length() >= param.length())?user.getFirstName().substring(0,param.length()).equalsIgnoreCase(param):false ||
                                (user.getLastName().length() >= param.length())?user.getLastName().substring(0,param.length()).equalsIgnoreCase(param):false ||
                               (user.getSsn().length() >= param.length())?user.getSsn().substring(0,param.length()).equalsIgnoreCase(param):false)
                .toList();
        System.out.println("Filtered Users: " + filteredUsers.toString());
        return filteredUsers;
    }

    //get Users by Id
    public List<User> getAllUsersById(String userId) {
        // Logic to retrieve all users
        List<User> allUsers = (users == null)?getAllUsers():users;
        List<User> usersById = allUsers.stream()
                .filter(user -> String.valueOf(user.getId()).equalsIgnoreCase(userId))
                .toList();
        return usersById;
    }

    //get Users by Email
    public List<User> getAllUsersByEmail(String email) {
        List<User> allUsers = (users == null)?getAllUsers():users;
        List<User> usersByEmail = allUsers.stream()
                .filter(user -> user.getEmail().equalsIgnoreCase(email))
                .toList();
        return usersByEmail;
    }   

}
