package com.wyq.listener;


import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

/**
 * @ClassName RedisMessageListener
 * @Description: //TODO redis信息的监听器
 * @Author wyq
 * @Date 2022/3/30 17:03
 */
public class RedisMessageListener implements MessageListener {
    /**
     * 	处理redis消息：当从redis中获取消息后，打印主题名称和基本的消息
     */
    @Override
    public void onMessage(Message message, byte[] pattern) {
        System.out.println("从channel为" + new String(message.getChannel())
                + "中获取了一条新的消息,消息内容:" + new String(message.getBody()));
    }

}
