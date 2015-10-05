package com.mapper;

import com.model.User_level;

public interface User_levelMapper {
    int deleteByPrimaryKey(Integer userLevelId);

    int insert(User_level record);

    int insertSelective(User_level record);

    User_level selectByPrimaryKey(Integer userLevelId);

    int updateByPrimaryKeySelective(User_level record);

    int updateByPrimaryKey(User_level record);
}