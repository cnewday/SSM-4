package com.mapper;

import com.model.Company_comment;

public interface Company_commentMapper {
    int deleteByPrimaryKey(Integer commentId);

    int insert(Company_comment record);

    int insertSelective(Company_comment record);

    Company_comment selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(Company_comment record);

    int updateByPrimaryKey(Company_comment record);
}