package com.xzf.house.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class PageRequest  {
    private String key;// 搜索条件
    private static final Integer DEFAULT_SIZE = 10;// 每页大小，不从页面接收，而是固定大小
    private static final Integer DEFAULT_PAGE = 1;// 默认页
    private Integer page;// 当前页
    private Map<String,Object> filter;//过滤参数

}
