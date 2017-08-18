/*
 * @(#) IndexController.java 2017/8/18
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.simpo.demo;

import com.simpo.demo.model.User;
import com.simpo.demo.service.UserSertvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuwc
 * @version 1.0
 * @since 2017/8/18
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private UserSertvice userSertvice;

    /**
     * 首页
     * @return
     */
    @RequestMapping("")
    public String index(){
        return "This Is My First SpringBoot Project!!!";
    }

    /**
     *  获取用户
     * @param userId
     * @param map
     * @return
     */
    @RequestMapping("/getUser")
    public User getUser(String userId, ModelMap map){
        User user = userSertvice.getUser(userId);
        map.put("user",user);
        return user;
    }
}
