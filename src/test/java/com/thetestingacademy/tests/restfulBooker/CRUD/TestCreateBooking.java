package com.thetestingacademy.tests.restfulBooker.CRUD;

import com.thetestingacademy.base.BaseTest;
import com.thetestingacademy.endpoints.APIConstants;
import com.thetestingacademy.modules.PayloadManager;
import com.thetestingacademy.pojos.responsepojos.BookingResponse;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCreateBooking extends BaseTest {

    @Test(groups = "reg", priority = 1)
    @Owner("Pramod Dutta")
    @Description("TC#INT1- Step1 . Verify that booking can be created")
    public void testCreateBookingPost_Positive(){

        //Part1-Setup and making the request

        //Part3-Verification and Validation via Assertj, TESTNG

        requestSpecification.basePath(APIConstants.CREATE_UPDATE_BOOKING_URl);
        response= RestAssured.given(requestSpecification)
                .when().body(PayloadManager.createPayloadBookingAsString())
                .log().all().post();

        //Part2-Extraction
        BookingResponse bookingResponse = PayloadManager.bookingResponseJava(response.asString());


        //Part3-Verification and Validation via Assertj, TESTNG
        assertActions.verifyStatusCode(response, 200);
        assertActions.verifyIntegerKeyNotNull(bookingResponse.getBookingid());
        assertActions.verifyStringKey(bookingResponse.getBooking().getFirstName(),"Lucky");

    }

    @Test(groups = "reg", priority = 1)
    @Owner("Pramod Dutta")
    @Description("TC#INT1- Step1 . Verify that booking can't be created, when payload is null")
    public void testCreateBookingPost_Negative(){

        //Part1-Setup and making the request

        //Part3-Verification and Validation via Assertj, TESTNG

        requestSpecification.basePath(APIConstants.CREATE_UPDATE_BOOKING_URl);
        response= RestAssured.given(requestSpecification)
                .when().body("{}")
                .log().all().post();

        //Part2-Extraction
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(500);



    }


}
