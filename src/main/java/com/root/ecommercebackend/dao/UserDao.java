package com.root.ecommercebackend.dao;

import com.root.ecommercebackend.model.user.User;

public interface UserDao {
    int insertUser(User user);

    default int addUser(User user){

        return insertUser(user);
    }
}
