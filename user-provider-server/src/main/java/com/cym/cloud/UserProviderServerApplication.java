package com.cym.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


@EnableEurekaClient
@SpringBootApplication
@EnableHystrix
@MapperScan("com.cym.cloud.mapper")
public class UserProviderServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserProviderServerApplication.class, args);
    }

}
