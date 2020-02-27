package com.xzf.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@TableName("house")
@Data
@Accessors(chain = true)
public class House {
    @TableId(type = IdType.AUTO)
    private  Integer id;
    private  String title;
    private  String content;
    private  Integer price;
    private  String country;
    private String address;
    private Integer tid;//房间分类id
    private String type;//租房类型(整租/合租)
    private String images;//图片集合
    private Integer uid;//房东id
    private String area;//面积
    private String payment;//支付方式
    private String fids;
    @JsonFormat(pattern ="yyyy-MM-dd" )
    private Date createTime;
    @JsonFormat(pattern ="yyyy-MM-dd" )
    private Date updateTime;
    private Boolean valid;
}
