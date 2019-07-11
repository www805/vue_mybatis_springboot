package com.zhuang.controller;

import com.zhuang.entity.User;
import com.zhuang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserAll")
    public List<User> getUserAll(){
        return userService.getUserAll();
    }

    @RequestMapping("/getUserByid/{id}")
    public User getUserByid(@PathVariable int id){
        return userService.getUserByid(id);
    }

    @RequestMapping("/addUser")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @RequestMapping("/delUser/{id}")
    public String delUser(@PathVariable("id") int id){
        return userService.delUser(id);
    }
}
