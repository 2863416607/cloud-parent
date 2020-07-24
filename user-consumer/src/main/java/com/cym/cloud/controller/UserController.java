package com.cym.cloud.controller;

import com.cym.cloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


/**
 * @Auther: 陈远明
 * @Date: 2020/7/24 20 : 34
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/selectList", method = RequestMethod.GET)
    public List add(User user) {
        return restTemplate.getForObject("http://USER-PROVIDER-SERVER/user/selectList", List.class);
    }

}
