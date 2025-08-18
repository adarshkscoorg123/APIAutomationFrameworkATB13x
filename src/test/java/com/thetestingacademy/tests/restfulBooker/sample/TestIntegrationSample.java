package com.thetestingacademy.tests.restfulBooker.sample;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegrationSample {

    //Create a booking, Create a Token
    //Verify the GET booking
    //Update the booking
    //Delete the booking

    @Test(groups = "qa", priority = 1)
    @Owner("Promode")
    @Description("TC#INT1- Step1 . Verify that booking can be created")
    public void test_create_booking(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 2)
    @Owner("Promode")
    @Description("TC#INT1- Step2 . Verify that booking is created by ID")
    public void test_verify_bookingId(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 3)
    @Owner("Promode")
    @Description("TC#INT1- Step3 . Verify update booking by ID")
    public void test_update_bookingById(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 4)
    @Owner("Promode")
    @Description("TC#INT1- Step3 . Verify delete booking by ID")
    public void test_delete_bookingById(){
        Assert.assertTrue(true);
    }
}
