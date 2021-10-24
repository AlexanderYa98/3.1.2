package com.example311.service;



import com.example311.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    User getUser(Long id);

    void updateUser(User user);

    void deleteUser(Long id);

    List<User> allUsers();

    User getUserByName(String name);

}