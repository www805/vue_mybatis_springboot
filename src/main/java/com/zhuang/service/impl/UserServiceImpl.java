package com.zhuang.service.impl;

import com.zhuang.mapper.UserMapper;
import com.zhuang.entity.User;
import com.zhuang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserAll() {
        return userMapper.getUserAll();
    }

    @Override
    public User getUserByid(int id) {
        return userMapper.getUserByid(id);
    }

    @Override
    public String addUser(User user) {

        int insert = userMapper.addUser(user);
        String msg = "";

        if(insert == 1){
            msg = "新增成功";
        }else{
            msg = "操作失败";
        }

        return msg;
    }

    @Override
    public String delUser(int id) {
        int delete = userMapper.delUser(id);
        return delete == 1 ? "删除成功" : "删除失败";
    }


}
