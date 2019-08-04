package com.zhuang.service;

import com.zhuang.common.entity.User;

import java.util.List;

public interface UserService {

    List<User> getUserAll();

    User getUserByid(int id);

    String addUser(User user);

    String delUser(int id);

    String updateUser(User user);

    List<User> getUserList();

}
