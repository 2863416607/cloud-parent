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
 * @Date: 2020/7/26 21 : 36
 * @Description: 舱壁模式
 */
@RestController
@RequestMapping("/userBulkhead")
public class UserBulkheadController {


    @Autowired
    private UserServiceClient userServiceClient;

   /*
   线程池方式
    @HystrixCommand(
            threadPoolKey = "selectList",
            threadPoolProperties = {
                    @HystrixProperty(name ="coreSize",value = "1"),
                    @HystrixProperty(name ="maxQueueSize",value = "-1")
            }, fallbackMethod = "selectListFallback")*/

 // 信号量方式
  @HystrixCommand(
           commandKey="selectList",
           commandProperties= {
                   @HystrixProperty(name="execution.isolation.strategy", value="SEMAPHORE"),
                   @HystrixProperty(name="execution.isolation.semaphore.maxConcurrentRequests", value="1")
           }, fallbackMethod = "selectListFallback")
    @RequestMapping(value = "/selectList", method = RequestMethod.GET)
    public List selectList(User user) {
        return userServiceClient.selectList(user);
    }

  /*  public List<User> selectListFallback(User user){
        List<User> objects = new ArrayList<>();
        objects.add(new User(1,"1","1","1",1));
        return objects;
    }*/

}
