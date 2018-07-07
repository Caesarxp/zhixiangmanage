package com.zhixiang.zhixiangmanage.mapper;

import com.zhixiang.zhixiangmanage.po.UserAccountOrderItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserAccountOrderItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserAccountOrderItem record);

    int insertSelective(UserAccountOrderItem record);

    UserAccountOrderItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserAccountOrderItem record);

    int updateByPrimaryKey(UserAccountOrderItem record);
}