package com.bwf.gitproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/admin")
    @ResponseBody
    public String admin(){

        return "用户管理";
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(){
        return "添加用户";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(){
        return "修改用户";
    }
}
