package com.cym.cloud.controller;

import com.cym.cloud.pojo.User;
import com.cym.cloud.service.UserServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServie userServie;

    @RequestMapping(value = "/selectList")
    public List<User> selectList(){
       List<User> userList= userServie.selectList();
        return userList;
    }

}
