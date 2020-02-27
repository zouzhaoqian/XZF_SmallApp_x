package com.xzf.house.controller;


import com.xzf.house.service.HouseService;
import com.xzf.pojo.Facilities;
import com.xzf.pojo.House;
import com.xzf.pojo.HouseType;
import com.xzf.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("house")
public class HouseController {
     @Autowired
     private HouseService houseService;
     //新增房源
     @RequestMapping("add")
     public Result  addHouse(@RequestBody House house){
            houseService.addHouse(house);
     return  Result.ok();
     }
     //修改房源信息
     @RequestMapping("update")
     public Result  updateHouse(@RequestBody House house){
          houseService.updateHouse(house);
          return  Result.ok();
     }
     //下架房源
     @RequestMapping("valid_off/{id}")
     public Result  valid_off(@PathVariable("id") Integer id){
          houseService.valid_off(id);
          return  Result.ok();
     }
     //上架房源
     @RequestMapping("valid_on/{id}")
     public Result  valid_on(@PathVariable("id") Integer id){
          houseService.valid_on(id);
          return  Result.ok();
     }
     //查询所有设施
     @RequestMapping("queryfacilities")
     public Result  queryfacilities(){
         List<Facilities> result=houseService.queryfacilities();
          return  Result.ok(result);
     }
     //查询所有房源分类
     @RequestMapping("queryhousetype")
     public Result  queryHouseType(){
          List<HouseType> result=houseService.queryHouseType();
          return  Result.ok(result);
     }
     //删除房源
     @RequestMapping("delete/{id}")
     public Result  deleteHouseById(@PathVariable("id") Integer id){
          if(id==null){
               return  Result.fail("badrequest");
          }
          int result=houseService.deleteHouseById(id);
          if(result==0){
               return  Result.fail("id不存在");
          }
          return  Result.ok();
     }
     //查询房东发布的房源
     @RequestMapping("queryownbyuid/{uid}")
     public Result  queryownByUid(@PathVariable("uid") Integer uid){
          if(uid==null){
               return  Result.fail("用户不存在");
          }
         List<House> result=houseService.queryownByUid(uid);
           if(CollectionUtils.isEmpty(result)){
                return  Result.fail("您没有发布任何房源");
           }
         return Result.ok(result);
     }
     //查询用户收藏的房源
     @RequestMapping("queryfavbyuid/{uid}")
     public Result  queryfavByUid(@PathVariable("uid") Integer uid){
          if(uid==null){
               return  Result.fail("用户不存在");
          }
          List<House> result=houseService.queryfavByUid(uid);
          if(CollectionUtils.isEmpty(result)){
               return  Result.fail("您还没有收藏任何房源");
          }
          return Result.ok(result);
     }
}
