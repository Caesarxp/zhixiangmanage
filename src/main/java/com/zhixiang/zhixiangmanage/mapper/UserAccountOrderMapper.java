package com.zhixiang.zhixiangmanage.mapper;

import com.zhixiang.zhixiangmanage.po.UserAccountOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserAccountOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserAccountOrder record);

    int insertSelective(UserAccountOrder record);

    UserAccountOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserAccountOrder record);

    int updateByPrimaryKey(UserAccountOrder record);
}