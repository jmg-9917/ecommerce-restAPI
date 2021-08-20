package com.root.ecommercebackend.controller;

import com.root.ecommercebackend.model.user.User;
import com.root.ecommercebackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserResource {
    private final UserService userService;
    @Autowired
    public UserResource(UserService userService) {
        this.userService = userService;
    }


}
