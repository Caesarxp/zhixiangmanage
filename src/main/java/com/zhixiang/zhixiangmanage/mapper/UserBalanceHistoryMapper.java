package com.zhixiang.zhixiangmanage.mapper;

import com.zhixiang.zhixiangmanage.po.UserBalanceHistory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserBalanceHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserBalanceHistory record);

    int insertSelective(UserBalanceHistory record);

    UserBalanceHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserBalanceHistory record);

    int updateByPrimaryKey(UserBalanceHistory record);
}