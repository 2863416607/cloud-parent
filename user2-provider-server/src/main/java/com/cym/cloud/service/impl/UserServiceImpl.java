package com.cym.cloud.service.impl;

import com.cym.cloud.mapper.UserMapper;
import com.cym.cloud.pojo.User;
import com.cym.cloud.service.UserServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServie {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectList() {
        return userMapper.selectList(null);
    }
}
