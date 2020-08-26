package com.cym.cloud.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Auther: 陈远明
 * @Date: 2020/8/26 22 : 11
 * @Description:
 */
@RequestMapping("/message")
@RestController
public class MessageController {

    @Autowired
    private StreamClient streamClient;


    @RequestMapping("/getMessage")
    public String process(){
        String message="now"+new Date();
        streamClient.output().send(MessageBuilder.withPayload(message).build());
        return "成功";
    }

}
