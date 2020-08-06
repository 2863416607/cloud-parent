package com.cym.cloud.api;

import com.cym.cloud.pojo.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 陈远明
 * @Date: 2020/8/4 00 : 38
 * @Description:
 */
@Component
public class UserServiceFallbackFactory implements FallbackFactory<UserServiceClient> {

    @Override
    public UserServiceClient create(Throwable throwable) {
        return new UserServiceClient() {
            @Override
            public List selectList(User user) {
                List<User> objects = new ArrayList<>();
                objects.add(new User(1,"1","1","1",1));
                return objects;
            }
        };
    }
}
