package com.xzf.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

@TableName("house_type")
@Data
@Accessors(chain = true)
public class HouseType {
    @TableId(type = IdType.AUTO)
    private  Integer id;
    private  String name;
}
