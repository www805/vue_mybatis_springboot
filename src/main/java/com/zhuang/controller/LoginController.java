package com.zhuang.controller;

import com.zhuang.common.param.UserParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Api(value = "用户登录控制器", tags = {"登录接口"})
@Controller
public class LoginController {


    @RequestMapping("/toLogin")
    public ModelAndView gotoLongin(Model model) {
        model.addAttribute("title", "用户登录");
        return new ModelAndView("/toLogin", "toLoginModel", model);
    }


    @ApiOperation(value = "通过ID查询指定用户", notes = "获取一个用户")
    @RequestMapping("/loginCaChe")
    public ModelAndView loginCaChe(UserParam param, Model model, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            //参数验证error
            model.addAttribute("msg", bindingResult.getFieldError().getDefaultMessage());
            return gotoLongin(model);
        } else {

            //获取subject
            Subject subject = SecurityUtils.getSubject();
            //封装用户数据
            UsernamePasswordToken token = new UsernamePasswordToken(param.getUsername(), param.getPassword());

            //执行登录方法
            try {
                subject.login(token);

            } catch (UnknownAccountException e) {
                model.addAttribute("msg", "用户名不存在");
                return gotoLongin(model);
            } catch (IncorrectCredentialsException e) {
                model.addAttribute("msg", "用户名或密码错误");
                return gotoLongin(model);
            }

        }

        return new ModelAndView("/index", "getIndex", model);
    }

}
