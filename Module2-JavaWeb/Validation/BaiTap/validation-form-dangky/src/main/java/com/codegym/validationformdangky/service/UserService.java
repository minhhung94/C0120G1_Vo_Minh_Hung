package com.codegym.validationformdangky.service;

import com.codegym.validationformdangky.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(Long id);

    void save(User user);

    void remove(Long id);
}
