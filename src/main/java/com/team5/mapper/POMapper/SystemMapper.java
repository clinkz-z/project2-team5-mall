package com.team5.mapper.POMapper;

import com.team5.bean.PO.SystemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemMapper {
    long countByExample(SystemExample example);

    int deleteByExample(SystemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(System record);

    int insertSelective(System record);

    List<System> selectByExample(SystemExample example);

    System selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") System record, @Param("example") SystemExample example);

    int updateByExample(@Param("record") System record, @Param("example") SystemExample example);

    int updateByPrimaryKeySelective(System record);

    int updateByPrimaryKey(System record);
}