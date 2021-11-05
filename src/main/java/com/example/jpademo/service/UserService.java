package com.example.jpademo.service;

import com.example.jpademo.domain.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User save(User user);
}
