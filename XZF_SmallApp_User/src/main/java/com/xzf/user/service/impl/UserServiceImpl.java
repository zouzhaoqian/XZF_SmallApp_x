package com.xzf.user.service.impl;

import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xzf.pojo.Result;
import com.xzf.pojo.User;
import com.xzf.user.dto.WxLoginDto;
import com.xzf.user.mapper.UserMapper;
import com.xzf.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import com.alibaba.fastjson.JSON;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    RestTemplate restTemplate;
    @Override
    public void delete(Integer id) {
        userMapper.delete(id);
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
