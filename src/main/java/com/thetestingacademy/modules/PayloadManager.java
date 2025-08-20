package com.thetestingacademy.modules;

import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.thetestingacademy.pojos.requestPojos.Booking;
import com.thetestingacademy.pojos.requestPojos.BookingDates;
import com.thetestingacademy.pojos.responsepojos.BookingResponse;

public class PayloadManager {

    // The responsibility of POJO is to do serialization and deserialization

    static Gson gson;
    Faker faker;

    // Serialization
    // Convert the Java Object into the JSON String to use as a Payload

    // Valid booking
    public static String createPayloadBookingAsString(){
        Booking booking = new Booking();
        booking.setFirstName("Lucky");
        booking.setLastName("Dutta");
        booking.setTotalprice(112);
        booking.setDepositpaid(true);

        BookingDates bookingDates = new BookingDates();
        bookingDates.setCheckin("2024-02-01");
        bookingDates.setCheckout("2024-02-05");
        booking.setBookingDates(bookingDates);
        booking.setAdditionalneeds("Breakfast");

        System.out.println(booking);
        return gson.toJson(booking);

        // The java object will be converted to Json format like below

        //{
            //"firstname" : "Adarsh1",
               // "lastname" : "Suresh1",
                //"totalprice" : 4100,
               // "depositpaid" : true,
                //"bookingdates" : {
            //"checkin" : "2025-07-02",
                   // "checkout" : "2025-07-27"
       // },
           // "additionalneeds" : "Breakfast"
        //}
    }

    // invalid booking
    public String createPayloadBookingAsStringWrongBody(){
        Booking booking = new Booking();
        booking.setFirstName("汉字, /漢字");
        booking.setLastName("/漢字");
        booking.setTotalprice(112);
        booking.setDepositpaid(true);

        BookingDates bookingDates = new BookingDates();
        bookingDates.setCheckin("5025-02-01");
        bookingDates.setCheckout("5025-02-05");
        booking.setBookingDates(bookingDates);
        booking.setAdditionalneeds("汉字");

        return null;
    }

    // Valid booking with dynamic data
    public String createPayloadBookingFakerJs(){
        //This option is used when you dynamically generate the first name.
        //First way-> lastname and other variables through faker
        //faker = new Faker();

        // Second way
        //Method with the dynamic data we use
        //We will fetch the data from Excel file
        // We will use APACHE POI
        //Store the value of Firstname, Lastname and everything and then->
        // ->we will verify from the response

        return null;
    }

    // Deserialization
    // Convert JSON String to Java Objects

    public static BookingResponse bookingResponseJava(String responseString){
        gson = new Gson();
        BookingResponse bookingResponse = gson.fromJson(responseString,BookingResponse.class);
        return bookingResponse;
    }
    

}
