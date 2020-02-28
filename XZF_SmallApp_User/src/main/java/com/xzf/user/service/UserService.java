package com.xzf.user.service;

import com.xzf.pojo.User;

import java.util.List;

public interface UserService {
    void delete(Integer id);
    User findById(Integer id);
    void update(User user);
    List<User> selectAll();
}
