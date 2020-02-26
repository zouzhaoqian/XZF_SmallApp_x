package com.xzf.house.service;

import com.xzf.pojo.House;

import java.util.List;

public interface HouseService {
    void addHouse(House house);

    void updateHouse(House house);

    int deleteHouseById(Integer id);
    List<House> queryownByUid(Integer uid);
    List<House> queryfavByUid(Integer uid);
}
