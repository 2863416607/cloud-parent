package com.cym.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class CloudMqApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudMqApplication.class, args);
    }

}
