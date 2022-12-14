package com.example.tests;

import com.example.models.RegisterModelDto;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static com.example.specs.Specs.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationTests {
    @Test
    void getListUsers() {
        given()
                .spec(userRequestSpec)
                .get("?page=2")
                .then()
                .log().body()
                .statusCode(200)
                .body("total", is(12))
                .log().status();
    }


    @Test
    void registerUser() {

        RegisterModelDto user = new RegisterModelDto();
        user.setJob("leader");
        user.setName("morpheus");
        user.setEmail("michael.lawson@reqres.in");
        user.setPassword("morpheus.holt@reqres.in");

        given()
                .spec(registerRequestSpec)
                .body(user)
                .when()
                .post()
                .then()
                .spec(logsInResponse);
    }


    @Test
    void updateUserAndCheckResults() {

        RegisterModelDto user = new RegisterModelDto();
        user.setJob("zion resident");
        user.setName("morpheus");
        user.setEmail("michael.lawson@reqres.in");
        user.setPassword("morpheus.holt@reqres.in");


        String expectedResponseJob = "zion resident";

        String actualBody = given()
                .log().uri()
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .post("https://reqres.in/api/users/2")
                .then()
                .log().status()
                .log().body()
                .statusCode(201)
                .extract()
                .path("job");
        assertEquals(actualBody, expectedResponseJob);
    }


    @Test
    void singleTest() {

        String expectedResponse = "{}";

        Response actualResponse = given()
                .spec(singleUrl)
                .when()
                .get("33")
                .then()
                .extract()
                .response();

        String actualResponseString = actualResponse.asString();

        assertEquals(expectedResponse, actualResponseString);
        System.out.println(actualResponse);
    }

    @Test
    void singleNotFoundTest() {
        given()
                .spec(userRequestSpec)
                .when()
                .get("/23")
                .then()
                .spec(logsInResponse)
                .statusCode(404);
    }
}
