package com.xzf.user.mapper;

import com.xzf.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    void delete(Integer id);
    User findById(Integer id);
    void update(User user);
    List<User> selectAll();
}
