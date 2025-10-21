package com.kodilla.rest.controller;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class ExternalApiRestAssuredUpdateTest {

    @Test
    void testUpdatePostShouldReturnStatus200AndValidateResponse() {
        String updatedBody = """
                {
                    "id": 1,
                    "userId": 1,
                    "title": "Updated Title",
                    "body": "Updated body content"
                }
                """;

        given()
                .header("Content-Type", "application/json")
                .body(updatedBody)
                .when()
                .put("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .assertThat()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("userId", equalTo(1))
                .body("title", equalTo("Updated Title"))
                .body("body", equalTo("Updated body content"))
                .log().all();
    }
}
