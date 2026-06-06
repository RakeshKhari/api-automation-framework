package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import base.BaseTest;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Epic("API Automation")
@Feature("Posts API")
public class TC04_Create_Post extends BaseTest {

    @Test
    @Story("Validate Post Request")
    @Description("Validate Create /posts endpoint")
    public void createPost() {

        String payload =
                "{ \"title\":\"API\" }";

        given()
                .contentType("application/json")
                .body(payload)
                .when()
                .post(BASE_URL + "/posts")
                .then()
                .statusCode(201);

    }
}