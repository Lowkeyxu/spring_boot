/*
 * @(#) UserSertvice.java 2017/8/18
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.simpo.demo.service;

import com.simpo.demo.model.User;

/** 用户service
 * @author xuwc
 * @version 1.0
 * @since 2017/8/18
 */
public interface UserSertvice{
    //获取用户信息
    User getUser(String userId);
}
