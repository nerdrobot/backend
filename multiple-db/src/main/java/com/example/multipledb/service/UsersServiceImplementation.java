package com.example.multipledb.service;

import com.example.multipledb.model.users.User;
import com.example.multipledb.repository.users.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersServiceImplementation implements UsersService {

    private final UsersRepository usersRepository;

    @Override
    public User save(User user) {
        return usersRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return usersRepository.findAll();
    }
}
