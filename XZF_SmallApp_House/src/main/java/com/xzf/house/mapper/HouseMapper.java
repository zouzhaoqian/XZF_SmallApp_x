package com.xzf.house.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xzf.pojo.House;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HouseMapper extends BaseMapper<House> {
    @Select("select * from house where id in (select hid from user_fav where uid=#{uid})")
    List<House> queryfavByUid(@Param("uid") Integer uid);
     @Select("select * from house  where uid=#{uid} ")
    List<House> selectByUid(@Param("uid") Integer uid);
}
