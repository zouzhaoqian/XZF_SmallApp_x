package com.xzf.house.controller;


import com.xzf.house.service.HouseService;
import com.xzf.pojo.House;
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
     @RequestMapping("add")
     public Result  addHouse(@RequestBody House house){
            houseService.addHouse(house);
     return  Result.ok();
     }
     @RequestMapping("update")
     public Result  updateHouse(@RequestBody House house){
          houseService.updateHouse(house);
          return  Result.ok();
     }
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
     @RequestMapping("queryownByUid/{uid}")
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
     @RequestMapping("queryfavByUid/{uid}")
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
