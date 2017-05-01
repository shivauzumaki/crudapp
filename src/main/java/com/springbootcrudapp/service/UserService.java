package com.springbootcrudapp.service;

/**
 * Created by Shiva on 4/29/2017.
 */

import com.springbootcrudapp.model.User;

import java.util.List;

public interface UserService {

    User findById(Long id);

    User findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(Long id);

    void deleteAllUsers();

    List<User> findAllUsers();

    boolean isUserExist(User user);
}