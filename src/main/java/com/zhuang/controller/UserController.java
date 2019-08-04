package com.zhuang.controller;

import com.zhuang.common.entity.User;
import com.zhuang.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

//@Api(description = "用户管理接口")
@Api(value = "用户管理接口", tags = {"用户接口"})
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取用户列表", notes = "获取所有用户信息")
    @GetMapping("/getUserAll")
    public List<User> getUserAll() {
        return userService.getUserAll();
    }

    @ApiOperation(value = "通过ID查询指定用户", notes = "获取一个用户")
    @GetMapping("/getUserByid/{id}")
    public User getUserByid(@PathVariable int id) {
        return userService.getUserByid(id);
    }

    @ApiOperation(value = "创建用户", notes = "创建一个用户")
    @PostMapping("/addUser")
    public String addUser(@ApiParam(value = "创建参数", required = true) @RequestBody @Valid User user) {
        return userService.addUser(user);
    }

    @ApiOperation(value = "删除用户", notes = "通过用户id删除一个用户")
    @DeleteMapping("/delUser/{id}")
    public String delUser(@PathVariable("id") int id) {
        return userService.delUser(id);
    }


    @ApiOperation(value = "修改用户", notes = "修改一个用户")
    @PutMapping("/updateUser")
    public String updateUser(@RequestBody @Valid User user) {
        return userService.updateUser(user);
    }

    @GetMapping("getUserList")
    public List<User> getUserList(){
        return userService.getUserList();
    }

}
