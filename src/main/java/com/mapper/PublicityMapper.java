package com.mapper;

import com.model.Publicity;

public interface PublicityMapper {
    int deleteByPrimaryKey(Integer publicityId);

    int insert(Publicity record);

    int insertSelective(Publicity record);

    Publicity selectByPrimaryKey(Integer publicityId);

    int updateByPrimaryKeySelective(Publicity record);

    int updateByPrimaryKeyWithBLOBs(Publicity record);
}