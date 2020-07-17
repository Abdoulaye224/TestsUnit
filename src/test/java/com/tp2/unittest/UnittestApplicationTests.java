package com.tp2.unittest;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RunWith(Suite.class)
@Suite.SuiteClasses({
        UserTest.class
})
class UnittestApplicationTests {

    @Test
    void contextLoads() {
    }

}
