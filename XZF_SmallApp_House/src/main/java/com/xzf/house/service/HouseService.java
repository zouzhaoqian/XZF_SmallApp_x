package com.xzf.house.service;

import com.xzf.pojo.Facilities;
import com.xzf.pojo.House;
import com.xzf.pojo.HouseType;

import java.util.List;

public interface HouseService {
    void addHouse(House house);

    void updateHouse(House house);

    int deleteHouseById(Integer id);
    List<House> queryownByUid(Integer uid);
    List<House> queryfavByUid(Integer uid);

    void valid_off(Integer id);

    void valid_on(Integer id);

    List<Facilities> queryfacilities();

    List<HouseType> queryHouseType();
}
