package com.ryu.mapper;

import com.ryu.entities.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    Integer addUser(User user);

    User login(String username,String password);

}
