package com.xzf.user.controller;

import com.xzf.pojo.User;
import com.xzf.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/selectAll")
    public List<User> selectAll(){
        List<User> list=userService.selectAll();
        return list;
    }
    @RequestMapping("/selectOne")
    public String selectOne(@RequestBody User user){
        Integer id=user.getId();
        try {
            userService.findById(id);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
        }
        return "failure";
    }
    @RequestMapping("/update")
    public String update(@RequestBody User user) {
        System.out.println(user);
        try {
            userService.update(user);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "failure";
    }
    @RequestMapping("/delete")
    public String delete(@RequestBody User user) {
        Integer id = user.getId();
        try {
            userService.delete(id);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "failure";
    }
}
