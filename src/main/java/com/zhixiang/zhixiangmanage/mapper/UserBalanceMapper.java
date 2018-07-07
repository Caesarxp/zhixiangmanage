package com.zhixiang.zhixiangmanage.mapper;

import com.zhixiang.zhixiangmanage.po.UserBalance;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserBalanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserBalance record);

    int insertSelective(UserBalance record);

    UserBalance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserBalance record);

    int updateByPrimaryKey(UserBalance record);
}