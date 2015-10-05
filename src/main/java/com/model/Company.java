package com.model;

public class Company {
    private Integer companyId;

    private String companyName;

    private String companyLocation;

    private String companyTelephone;

    private Integer companyCode;

    private Integer companyCompCount;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public void setCompanyLocation(String companyLocation) {
        this.companyLocation = companyLocation == null ? null : companyLocation.trim();
    }

    public String getCompanyTelephone() {
        return companyTelephone;
    }

    public void setCompanyTelephone(String companyTelephone) {
        this.companyTelephone = companyTelephone == null ? null : companyTelephone.trim();
    }

    public Integer getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(Integer companyCode) {
        this.companyCode = companyCode;
    }

    public Integer getCompanyCompCount() {
        return companyCompCount;
    }

    public void setCompanyCompCount(Integer companyCompCount) {
        this.companyCompCount = companyCompCount;
    }
}