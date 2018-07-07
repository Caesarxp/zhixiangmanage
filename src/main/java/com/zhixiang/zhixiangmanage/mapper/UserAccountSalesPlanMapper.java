package com.zhixiang.zhixiangmanage.mapper;

import com.zhixiang.zhixiangmanage.po.UserAccountSalesPlan;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserAccountSalesPlanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserAccountSalesPlan record);

    int insertSelective(UserAccountSalesPlan record);

    UserAccountSalesPlan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserAccountSalesPlan record);

    int updateByPrimaryKey(UserAccountSalesPlan record);
}