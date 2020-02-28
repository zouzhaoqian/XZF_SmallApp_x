package com.xzf.user.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xzf.pojo.Result;
import com.xzf.pojo.User;
import com.xzf.user.dto.WxLoginDto;
import com.xzf.user.mapper.UserLoginMapper;
import com.xzf.user.mapper.UserMapper;
import com.xzf.user.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
public class UserLoginServiceImpl extends ServiceImpl<UserLoginMapper, User> implements UserLoginService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public Result login(String code) {
        if(code!=null && code.length()>0){
            //2、组装 微信需要的参数
            //Appid: wx81fc83a4c6bc3338
            //AppSecret：5a5a9a115c041f8c955aefcb9534bd0e
            String json= restTemplate.getForObject("https://api.weixin.qq.com/sns/jscode2session?appid=wx2d7e579cb40db8f0&secret=4b6fefabf050af6ec8f404a5b5a69016&js_code="+code+"&grant_type=authorization_code",String.class);
            //3、解析结果
            WxLoginDto loginDto= JSON.parseObject(json,WxLoginDto.class);
            if(loginDto.getErrcode()==0){
                //4、登录成功  做什么
                //1.新增登录信息
                User user=new User();
                user.setOpid(loginDto.getOpenid());
                getBaseMapper().insert(user);
                //记得将openId 返回给小程序
                return Result.ok(loginDto.getOpenid());

            }else {
                return Result.fail(loginDto.getErrmsg());
            }
        }else {
            return Result.fail("请传递code");
        }
    }
}
