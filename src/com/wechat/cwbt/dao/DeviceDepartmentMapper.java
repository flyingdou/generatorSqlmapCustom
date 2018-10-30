package com.wechat.cwbt.dao;

import com.wechat.cwbt.pojo.DeviceDepartment;

public interface DeviceDepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DeviceDepartment record);

    int insertSelective(DeviceDepartment record);

    DeviceDepartment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeviceDepartment record);

    int updateByPrimaryKey(DeviceDepartment record);
}