package com.xzf.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xzf.pojo.Result;
import com.xzf.pojo.User;

public interface UserLoginService extends IService<User> {
    Result login(String code);
}
