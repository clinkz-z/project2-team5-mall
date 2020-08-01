package com.team5.mapper;

import com.team5.bean.BO.AdminLoginBO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface AdminAuthMapper {
    int login(@Param("loginBO") AdminLoginBO loginBO);

    Integer getGoodsTotal();

    Integer getOrderTotal();

    Integer getProductTotal();

    Integer gerUserTotal();
}
