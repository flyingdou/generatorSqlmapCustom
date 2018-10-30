package com.wechat.cwbt.dao;

import com.wechat.cwbt.pojo.DeviceInfo;

public interface DeviceInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DeviceInfo record);

    int insertSelective(DeviceInfo record);

    DeviceInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeviceInfo record);

    int updateByPrimaryKey(DeviceInfo record);
}