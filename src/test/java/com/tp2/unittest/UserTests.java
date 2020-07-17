package com.tp2.unittest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.tp2.unittest.User;

import javax.annotation.Resource;

@SpringBootTest
public class UserTests {

    @Resource
   private User user;

    @Test
    public void validEmail(){
        String email ="abdou.test@test.com";
        Assert.assertTrue(user.validEmail(email));

    }
}
