package com.zhuang.mapper;

import com.zhuang.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    //获取全部信息
    List<User> getUserAll();

    //获取id数据
    User getUserByid(int id);

    //添加用户
    int addUser(@Param("user") User user);

    //删除用户
    int delUser(int id);

}
