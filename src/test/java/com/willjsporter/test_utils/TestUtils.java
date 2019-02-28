package com.willjsporter.test_utils;

import org.junit.Assert;

import static org.junit.Assert.fail;

public class TestUtils {

    public static void assertErrorMessage(Runnable r, String errorMessage) {
        try {
            r.run();
            fail("Expected an error but none was thrown");
        } catch (Exception e){
            if(e.getMessage() != errorMessage) {
                Assert.assertEquals("Messages were not equal", errorMessage, e.getMessage());
//                fail(String.format("Messages were not equal:\nExpected: %s\nGot: %s", errorMessage, e.getMessage()));
            }
        }
    }

}
