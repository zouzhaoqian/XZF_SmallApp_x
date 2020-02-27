package com.xzf.house.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xzf.pojo.Facilities;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FacilitiesMapper extends BaseMapper<Facilities> {
    @Select("select * from facilities")
    List<Facilities> selectAll();
}
