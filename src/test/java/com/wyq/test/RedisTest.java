package com.wyq.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.logging.Logger;

/**
 * @ClassName RedisTest
 * @Description: //TODO 测试redis
 * @Author wyq
 * @Date 2022/3/30 16:50
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-redis.xml")
public class RedisTest {
    private static Logger log = Logger.getLogger(String.valueOf(RedisTest.class));
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void testSend() {
        redisTemplate.opsForValue().set("itwyq01", "Hello Redis");
        String value = redisTemplate.opsForValue().get("itwyq01");
        log.info("从redis中获取的数据：" + value);
    }
}
