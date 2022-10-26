package com.example.tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationTests {
    @Test
    void getListUsers() {
        given()
                .log().uri()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .log().body()
                .statusCode(200)
                .body("total", is(12))
                .log().status();
    }

    @Test
    void createNewUser() {
        given()
                .body("{ \"name\": \"morpheus\", \"job\": \"leader\" }")
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .log().body()
                .log().status()
                .statusCode(201);
    }

    @Test
    void updateUserAndCheckResults() {

        JSONObject requestParams = new JSONObject();
        requestParams.put("name", "morpheus");
        requestParams.put("job", "zion resident");

        String expectedResponseJob = "zion resident";

        String actualBody = given()
                .log().uri()
                .contentType(ContentType.JSON)
                .body(requestParams.toString())
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
        String expectedResponse = "{\"data\":{\"id\":2,\"name\":\"fuchsia rose\",\"year\":2001," +
                "\"color\":\"#C74375\",\"pantone_value\":\"17-2031\"},\"support\":" +
                "{\"url\":\"https://reqres.in/#support-heading\"," +
                "\"text\":\"To keep ReqRes free, contributions towards server costs are appreciated!\"}}";
        Response actualResponse = given()
                .log().body()
                .when()
                .get("https://reqres.in/api/unknown/2")
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
                .get("https://reqres.in/api/unknown/23")
                .then()
                .log().body()
                .statusCode(404);
    }
}
