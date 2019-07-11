package com.zhuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping("/")
    public ModelAndView getIndex(Model model){
        model.addAttribute("title", "首页系统");
        return new ModelAndView("index", "getIndex", model);
    }

//    @RequestMapping(value = "/{pageid}")
//    public ModelAndView gotomain(Model model, @PathVariable("pageid")String pageid) {
//        return new ModelAndView(pageid);
//    }

    @RequestMapping("/getUser")
    public ModelAndView getUser(Model model){
        model.addAttribute("title", "用户列表");
        return new ModelAndView("user/getUser", "getUser", model);
    }

}
