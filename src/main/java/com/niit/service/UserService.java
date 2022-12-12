package com.niit.service;

import com.niit.domain.User;
import com.niit.exception.UserNotFoundException;

import java.util.List;


public interface UserService {

    public User saveUser(User user);

    public User findByUsernameAndPassword(String username, String password) throws UserNotFoundException;

    List<User> getAllUsers();

//  boolean validateUser(String username, String password) throws UserNotFoundException;

}
