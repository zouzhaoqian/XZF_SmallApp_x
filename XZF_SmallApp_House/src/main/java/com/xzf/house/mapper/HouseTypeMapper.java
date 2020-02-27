package com.xzf.house.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xzf.pojo.HouseType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HouseTypeMapper extends BaseMapper<HouseType> {
    @Select("select  * from house_type")
    List<HouseType> selectAll();
}
