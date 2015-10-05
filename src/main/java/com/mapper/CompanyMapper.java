package com.mapper;

import com.model.Company;
import com.model.CompanyWithBLOBs;

public interface CompanyMapper {
    int deleteByPrimaryKey(Integer companyId);

    int insert(CompanyWithBLOBs record);

    int insertSelective(CompanyWithBLOBs record);

    CompanyWithBLOBs selectByPrimaryKey(Integer companyId);

    int updateByPrimaryKeySelective(CompanyWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CompanyWithBLOBs record);

    int updateByPrimaryKey(Company record);
}