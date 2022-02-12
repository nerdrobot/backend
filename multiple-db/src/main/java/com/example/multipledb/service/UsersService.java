package com.example.multipledb.service;

import com.example.multipledb.model.users.User;

import java.util.List;

public interface UsersService {

    User save(User tutorials);

    List<User> getAllUsers();
}
