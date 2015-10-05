package com.mapper;

import com.model.Question;
import com.model.QuestionWithBLOBs;

public interface QuestionMapper {
    int deleteByPrimaryKey(Integer questionId);

    int insert(QuestionWithBLOBs record);

    int insertSelective(QuestionWithBLOBs record);

    QuestionWithBLOBs selectByPrimaryKey(Integer questionId);

    int updateByPrimaryKeySelective(QuestionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QuestionWithBLOBs record);

    int updateByPrimaryKey(Question record);
}