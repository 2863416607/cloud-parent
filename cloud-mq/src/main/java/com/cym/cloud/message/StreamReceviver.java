package com.cym.cloud.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: 陈远明
 * @Date: 2020/8/23 23 : 21
 * @Description:
 */
@Component
@EnableBinding(StreamClient.class)
public class StreamReceviver {

    private Logger logger= LoggerFactory.getLogger(MqReceiver.class);

    @StreamListener("myMessage")
    public void process(Object message){
        System.out.println(message);
    }


}
