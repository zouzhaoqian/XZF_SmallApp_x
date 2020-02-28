package com.xzf.user.controller;

import com.xzf.pojo.Result;
import com.xzf.user.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class UserLoginController {
    @Autowired
    private UserLoginService userLoginService;
    @RequestMapping("/do")
    public Result login(String code){
        return userLoginService.login(code);
    }
}
