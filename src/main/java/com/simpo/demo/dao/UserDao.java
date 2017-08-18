/*
 * @(#) UserDao.java 2017/8/18
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.simpo.demo.dao;

import com.simpo.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/** 用户接口
 * @author xuwc
 * @version 1.0
 * @since 2017/8/18
 */
@Mapper
@Repository
public interface UserDao {
    //获取用户信息
    User getUser(String userId);
}
