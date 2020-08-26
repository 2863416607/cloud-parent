package com.cym.cloud.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * @Auther: 陈远明
 * @Date: 2020/8/21 23 : 35
 * @Description:
 */
@Component
public class MqReceiver {

    private Logger logger=LoggerFactory.getLogger(MqReceiver.class);

    @RabbitListener(queuesToDeclare =@Queue("myQueue"))
    public void process(String message){
        logger.info(message);
    }


}
