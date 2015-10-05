package com.model;

public class Publicity {
    private Integer publicityId;

    private String publicityCompanyId;

    public Integer getPublicityId() {
        return publicityId;
    }

    public void setPublicityId(Integer publicityId) {
        this.publicityId = publicityId;
    }

    public String getPublicityCompanyId() {
        return publicityCompanyId;
    }

    public void setPublicityCompanyId(String publicityCompanyId) {
        this.publicityCompanyId = publicityCompanyId == null ? null : publicityCompanyId.trim();
    }
}