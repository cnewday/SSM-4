package com.model;

public class User {
    private Long userId;

    private Integer userLevelId;

    private Integer authorityId;

    private String userPhonenumber;

    private String userPassworld;

    private String userEmail;

    private Integer userSex;

    private String userRegistTime;

    private String userLogoTime;

    private Integer userCount;

    private String userLogo;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getUserLevelId() {
        return userLevelId;
    }

    public void setUserLevelId(Integer userLevelId) {
        this.userLevelId = userLevelId;
    }

    public Integer getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    public String getUserPhonenumber() {
        return userPhonenumber;
    }

    public void setUserPhonenumber(String userPhonenumber) {
        this.userPhonenumber = userPhonenumber == null ? null : userPhonenumber.trim();
    }

    public String getUserPassworld() {
        return userPassworld;
    }

    public void setUserPassworld(String userPassworld) {
        this.userPassworld = userPassworld == null ? null : userPassworld.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getUserRegistTime() {
        return userRegistTime;
    }

    public void setUserRegistTime(String userRegistTime) {
        this.userRegistTime = userRegistTime == null ? null : userRegistTime.trim();
    }

    public String getUserLogoTime() {
        return userLogoTime;
    }

    public void setUserLogoTime(String userLogoTime) {
        this.userLogoTime = userLogoTime == null ? null : userLogoTime.trim();
    }

    public Integer getUserCount() {
        return userCount;
    }

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public String getUserLogo() {
        return userLogo;
    }

    public void setUserLogo(String userLogo) {
        this.userLogo = userLogo == null ? null : userLogo.trim();
    }
}