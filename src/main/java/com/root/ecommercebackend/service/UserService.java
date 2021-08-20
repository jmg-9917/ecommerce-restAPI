package com.root.ecommercebackend.service;

import com.root.ecommercebackend.model.user.User;
import com.root.ecommercebackend.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    private final UserRepo  userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

}

