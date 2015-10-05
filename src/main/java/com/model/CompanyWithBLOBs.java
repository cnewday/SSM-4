package com.model;

public class CompanyWithBLOBs extends Company {
    private String evaluationPeple;

    private String companyPicture;

    public String getEvaluationPeple() {
        return evaluationPeple;
    }

    public void setEvaluationPeple(String evaluationPeple) {
        this.evaluationPeple = evaluationPeple == null ? null : evaluationPeple.trim();
    }

    public String getCompanyPicture() {
        return companyPicture;
    }

    public void setCompanyPicture(String companyPicture) {
        this.companyPicture = companyPicture == null ? null : companyPicture.trim();
    }
}