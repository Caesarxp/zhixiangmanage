package com.zhixiang.zhixiangmanage.mapper;

import com.zhixiang.zhixiangmanage.po.OrderPayInitInfo;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface OrderPayInitInfoMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(OrderPayInitInfo record);

    int insertSelective(OrderPayInitInfo record);


    OrderPayInitInfo selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(OrderPayInitInfo record);

    int updateByPrimaryKey(OrderPayInitInfo record);
}