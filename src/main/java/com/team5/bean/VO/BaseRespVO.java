package com.team5.bean.VO;

import lombok.Data;

/**
 * Vo viewObject
 * @param <T>
 * 这是前后端分离，json数据一个常用的格式
 */
@Data
public class BaseRespVO<T> {
    T data;
    String errmsg;//告诉前端请求的消息
    long errno;//自己的前后端应用 ： 自定义的状态码 → 通常前端根据该状态码做不同的处理

    public static BaseRespVO ok(){
        BaseRespVO<Object> baseRespVo = new BaseRespVO<>();
        baseRespVo.setErrno(0);
        baseRespVo.setErrmsg("成功");
        return baseRespVo;
    }
    public static BaseRespVO ok(Object data){
        BaseRespVO<Object> baseRespVo = new BaseRespVO<>();
        baseRespVo.setData(data);
        baseRespVo.setErrno(0);
        baseRespVo.setErrmsg("成功");
        return baseRespVo;
    }
    public static BaseRespVO ok(Object data, String errmsg){
        BaseRespVO<Object> baseRespVo = new BaseRespVO<>();
        baseRespVo.setData(data);
        baseRespVo.setErrno(0);
        baseRespVo.setErrmsg(errmsg);
        return baseRespVo;
    }
    public static BaseRespVO fail(){
        BaseRespVO<Object> baseRespVo = new BaseRespVO<>();
        baseRespVo.setErrno(500);
        baseRespVo.setErrmsg("失败");
        return baseRespVo;
    }
    public static BaseRespVO fail(String errmsg){
        BaseRespVO<Object> baseRespVo = new BaseRespVO<>();
        baseRespVo.setErrno(500);
        baseRespVo.setErrmsg(errmsg);
        return baseRespVo;
    }
}
