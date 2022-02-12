package com.example.multipledb.controller;

import com.example.multipledb.model.users.User;
import com.example.multipledb.repository.users.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {

    private final UsersRepository repository;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public User addUser(@RequestBody User user) {
        return repository.save(user);
    }

    @GetMapping
    public List<User> getUsers() {
        return repository.findAll();
    }
}
