package com.zhixiang.zhixiangmanage.mapper;

import com.zhixiang.zhixiangmanage.po.UserBrrowerWebsiteAccount;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserBrrowerWebsiteAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserBrrowerWebsiteAccount record);

    int insertSelective(UserBrrowerWebsiteAccount record);

    UserBrrowerWebsiteAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserBrrowerWebsiteAccount record);

    int updateByPrimaryKey(UserBrrowerWebsiteAccount record);
}