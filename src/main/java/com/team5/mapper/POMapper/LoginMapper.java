package com.team5.mapper.POMapper;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface LoginMapper {
    int login(@Param("loginMap") Map loginMap);
}
