package com.xjm;

import com.xjm.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {ConsumerServerApplication.class})
public class ConsumerServerApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {

        userService.bugTicket();

    }

}
