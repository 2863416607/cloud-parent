package com.cym.cloud;

import static org.junit.Assert.assertTrue;

import com.cym.cloud.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Optional;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void test() {
       User user=null;
       if (true) {
           user = new User(1, "1", "1", "1", 1);
       }
    }
}
