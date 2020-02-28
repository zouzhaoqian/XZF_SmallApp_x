package com.xzf.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

@TableName("house")
@Data
@Accessors(chain = true)
public class User {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String sex;
    private String nicheng;
    private String phone;
    private String wechat;
    private String name;
    private String identity_card;
    private Integer is_owner;
    private String opid;
    private String avarta;
    private String skey;
    private String sessionkey;
}
