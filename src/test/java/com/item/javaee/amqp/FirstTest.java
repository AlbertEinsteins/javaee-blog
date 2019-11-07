package com.item.javaee.amqp;

import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: FirstTest
 * @Description TODO
 * @Author: jff
 * @Date: 2019-11-06 23:33
 * @Version: 1.0
 **/
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class FirstTest {

    public void send() {
        
    }

    @Autowired
    RabbitTemplate rabbitTemplate ;
    public void receive() {

    }
}
