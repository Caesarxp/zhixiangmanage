package com.zhixiang.zhixiangmanage.mapper;

import com.zhixiang.zhixiangmanage.po.WebsiteRegisterConfiguration;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WebsiteRegisterConfigurationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WebsiteRegisterConfiguration record);

    int insertSelective(WebsiteRegisterConfiguration record);

    WebsiteRegisterConfiguration selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WebsiteRegisterConfiguration record);

    int updateByPrimaryKey(WebsiteRegisterConfiguration record);
}