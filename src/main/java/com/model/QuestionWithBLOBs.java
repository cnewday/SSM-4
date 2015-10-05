package com.model;

public class QuestionWithBLOBs extends Question {
    private String questionContext;

    private String questionPicture;

    public String getQuestionContext() {
        return questionContext;
    }

    public void setQuestionContext(String questionContext) {
        this.questionContext = questionContext == null ? null : questionContext.trim();
    }

    public String getQuestionPicture() {
        return questionPicture;
    }

    public void setQuestionPicture(String questionPicture) {
        this.questionPicture = questionPicture == null ? null : questionPicture.trim();
    }
}