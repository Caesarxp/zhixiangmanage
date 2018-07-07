package com.zhixiang.zhixiangmanage.mapper;

import com.zhixiang.zhixiangmanage.po.WebsiteAccount;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WebsiteAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WebsiteAccount record);

    int insertSelective(WebsiteAccount record);

    WebsiteAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WebsiteAccount record);

    int updateByPrimaryKey(WebsiteAccount record);
}