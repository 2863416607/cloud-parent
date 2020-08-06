package com.cym.cloud.api;

import com.cym.cloud.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Auther: 陈远明
 * @Date: 2020/7/26 12 : 01
 * @Description:
 */
@FeignClient(value = "USER-PROVIDER-SERVER",fallbackFactory = UserServiceFallbackFactory.class)
public interface UserServiceClient {

    @RequestMapping(value = "/user/selectList", method = RequestMethod.GET)
    public List selectList(User user);

}
