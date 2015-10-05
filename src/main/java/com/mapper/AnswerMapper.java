package com.mapper;

import com.model.Answer;

public interface AnswerMapper {
    int deleteByPrimaryKey(Integer answerId);

    int insert(Answer record);

    int insertSelective(Answer record);

    Answer selectByPrimaryKey(Integer answerId);

    int updateByPrimaryKeySelective(Answer record);

    int updateByPrimaryKeyWithBLOBs(Answer record);

    int updateByPrimaryKey(Answer record);
}