package com.xzf.house.service.imp;

import com.xzf.house.mapper.HouseMapper;
import com.xzf.house.service.HouseService;
import com.xzf.pojo.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HouseServiceImp implements HouseService {
    @Autowired
    private HouseMapper houseMapper;
    public void addHouse(House house) {
            house.setCreateTime(new Date());
        houseMapper.insert(house);
    }
    public void updateHouse(House house) {
        house.setUpdateTime(new Date());
        houseMapper.updateById(house);
    }
    public int deleteHouseById(Integer id) {
        return houseMapper.deleteById(id);
    }
    public List<House> queryownByUid(Integer uid) {
        return houseMapper.selectByUid(uid);
    }
    public List<House> queryfavByUid(Integer uid) {
        return  houseMapper.queryfavByUid( uid);
    }

}
