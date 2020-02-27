package com.xzf.house.service.imp;

import com.xzf.house.mapper.FacilitiesMapper;
import com.xzf.house.mapper.HouseMapper;
import com.xzf.house.mapper.HouseTypeMapper;
import com.xzf.house.service.HouseService;
import com.xzf.pojo.Facilities;
import com.xzf.pojo.House;
import com.xzf.pojo.HouseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HouseServiceImp implements HouseService {
    @Autowired
    private HouseMapper houseMapper;
    @Autowired
    private FacilitiesMapper facilitiesMapper;
    @Autowired
    private HouseTypeMapper houseTypeMapper;
    public void addHouse(House house) {
        house.setCreateTime(new Date()).setValid(true);
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
    public void valid_off(Integer id) {
        House house=new House();
        house.setId(id);
        house.setValid(false);
        house.setUpdateTime(new Date());
        houseMapper.updateById(house);
    }
    public void valid_on(Integer id) {
        House house=new House();
        house.setId(id);
        house.setValid(true);
        house.setUpdateTime(new Date());
        houseMapper.updateById(house);
    }
    public List<Facilities> queryfacilities() {
        return facilitiesMapper.selectAll();
    }

    public List<HouseType> queryHouseType() {
        return houseTypeMapper.selectAll();
    }

}
