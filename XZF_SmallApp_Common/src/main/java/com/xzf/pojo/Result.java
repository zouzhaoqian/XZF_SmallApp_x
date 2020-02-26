package com.xzf.pojo;

import com.baomidou.mybatisplus.extension.api.R;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result{
    private int code;
    private String msg;
    private Object data;

    public static Result ok(){
        return new Result(0,"OK",null);
    }
    public static Result ok(Object data){
        return new Result(0,"OK",data);
    }
    public static Result fail(String msg){
        return new Result(1,msg,null);
    }
}
