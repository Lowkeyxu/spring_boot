/*
 * @(#) UserServiceImpl.java 2017/8/18
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.simpo.demo.service.impl;

import com.simpo.demo.dao.UserDao;
import com.simpo.demo.model.User;
import com.simpo.demo.service.UserSertvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** 用户service实现
 * @author xuwc
 * @version 1.0
 * @since 2017/8/18
 */
@Service
public class UserServiceImpl implements UserSertvice {

    @Autowired
    private UserDao userDao;

    /**
     * 获取用户信息
     * @param userId
     * @return
     */
    @Override
    public User getUser(String userId) {
        return userDao.getUser(userId);
    }
}
