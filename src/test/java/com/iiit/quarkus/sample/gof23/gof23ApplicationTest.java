package com.iiit.quarkus.sample.gof23;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class gof23ApplicationTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/inform")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}