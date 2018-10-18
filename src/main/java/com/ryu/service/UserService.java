package com.ryu.service;

import com.ryu.entities.User;

public interface UserService {

    Integer addUser(User user);

    User Login(String username,String password);

}
