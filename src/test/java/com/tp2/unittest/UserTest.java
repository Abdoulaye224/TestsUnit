package com.tp2.unittest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserTest {

   @Autowired
   private User user;

    @Test
    public void validEmail(){

        String email ="abdou.test@test.com";

        Assert.assertTrue(user.validEmail(email));
    }
}
