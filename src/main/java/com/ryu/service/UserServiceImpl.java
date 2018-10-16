package com.ryu.service;

import com.ryu.entities.User;
import com.ryu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ghost
 * @create 2018-10-16 17:48
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer addUser(User user) {
        Integer num = userMapper.addUser(user);
        return num;
    }
}
