package com.model;

public class User_level {
    private Integer userLevelId;

    private String userLevelName;

    private Integer userLevelCount;

    public Integer getUserLevelId() {
        return userLevelId;
    }

    public void setUserLevelId(Integer userLevelId) {
        this.userLevelId = userLevelId;
    }

    public String getUserLevelName() {
        return userLevelName;
    }

    public void setUserLevelName(String userLevelName) {
        this.userLevelName = userLevelName == null ? null : userLevelName.trim();
    }

    public Integer getUserLevelCount() {
        return userLevelCount;
    }

    public void setUserLevelCount(Integer userLevelCount) {
        this.userLevelCount = userLevelCount;
    }
}