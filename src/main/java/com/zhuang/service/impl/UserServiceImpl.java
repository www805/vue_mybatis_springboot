package com.zhuang.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhuang.mapper.UserMapper;
import com.zhuang.common.entity.User;
import com.zhuang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserAll() {
        //开始分页
        PageHelper.startPage(1,10);
        //紧跟查询
        List<User> userAll = userMapper.getUserAll();
        //输出分页
        PageInfo<User> userPageInfo = new PageInfo<User>(userAll);

//        System.out.println(userPageInfo);

//        Properties properties = new Properties();
//        properties.setProperty()

        return userAll;
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

    @Override
    public String updateUser(User user) {

        return null;
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }


}
