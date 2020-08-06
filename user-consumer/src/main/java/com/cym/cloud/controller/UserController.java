package com.cym.cloud.controller;

import com.cym.cloud.api.UserServiceClient;
import com.cym.cloud.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * @Auther: 陈远明
 * @Date: 2020/7/24 20 : 34
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {
/*    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/selectList", method = RequestMethod.GET)
    public List selectList(User user) {
        return restTemplate.getForObject("http://USER-PROVIDER-SERVER/user/selectList", List.class);
    }*/


    @Autowired
    private UserServiceClient userServiceClient;

  /*  @HystrixCommand(
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
            }, fallbackMethod = "selectListFallback")*/
    @RequestMapping(value = "/selectList", method = RequestMethod.GET)
    public List selectList(User user) {
        return userServiceClient.selectList(user);
    }

/*    public List<User> selectListFallback(User user){
        List<User> objects = new ArrayList<>();
        objects.add(new User(1,"1","1","1",1));
        return objects;
    }*/

}

