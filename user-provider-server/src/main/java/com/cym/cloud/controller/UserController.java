package com.cym.cloud.controller;

import com.cym.cloud.pojo.User;
import com.cym.cloud.service.UserServie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@RefreshScope
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${from}")
    private String from;

    @Autowired
    private UserServie userServie;

    @RequestMapping(value = "/selectList")
    public List<User> selectList() {
        logger.info("进入服务提供者1");
        return userServie.selectList();
    }

    @RequestMapping(value = "/from")
    public String from(){
        return from;
    }
}
