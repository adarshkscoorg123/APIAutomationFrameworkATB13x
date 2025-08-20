package com.thetestingacademy.asserts;

import io.restassured.response.Response;

import static org.assertj.core.api.Assertions.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AssertActions {

    public void verifyResponseBody(String actual, String expected, String description){
        assertEquals(actual,expected,description);
    }

    public void verifyResponseBody(int actual, int expected, String description){
        assertEquals(actual,expected,description);
    }

    public void verifyStatusCode(Response response, int expected){
        assertEquals(response.getStatusCode(),expected);
    }

    public void verifyStringKey(String keyExpect, String keyActual){
        //Assertj
        assertThat(keyExpect).isNotNull();
        assertThat(keyExpect).isNotBlank();
        assertThat(keyExpect).isEqualTo(keyActual);
    }


    public void verifyIntegerKeyNotNull(Integer keyExpect){
        //Assertj
        assertThat(keyExpect).isNotNull();
    }

    public void verifyStringKeyNotNull(String keyExpect){
        //Assertj
        assertThat(keyExpect).isNotNull();
    }

    public void verifyTrue(boolean keyExpect){
        // TestNG
        assertTrue(keyExpect);
    }
















}
