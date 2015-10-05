package com.model;

public class Answer {
    private Integer answerId;

    private Integer questionId;

    private Integer answerUserId;

    private String answerContext;

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getAnswerUserId() {
        return answerUserId;
    }

    public void setAnswerUserId(Integer answerUserId) {
        this.answerUserId = answerUserId;
    }

    public String getAnswerContext() {
        return answerContext;
    }

    public void setAnswerContext(String answerContext) {
        this.answerContext = answerContext == null ? null : answerContext.trim();
    }
}