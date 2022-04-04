package com.wyq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName RedisTest02
 * @Description: //TODO 测试监听器
 * @Author wyq
 * @Date 2022/3/30 17:10
 */
public class RedisTest02 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-redis.xml");
    }
}
