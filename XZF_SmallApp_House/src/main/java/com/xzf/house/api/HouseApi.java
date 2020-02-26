package com.xzf.house.api;

import com.xzf.pojo.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("house")
public interface HouseApi {
    @RequestMapping("queryownByUid/{uid}")
    public Result  queryownByUid(@PathVariable("uid") Integer uid);
    @RequestMapping("queryfavByUid/{uid}")
    public Result  queryfavByUid(@PathVariable("uid") Integer uid);
}
