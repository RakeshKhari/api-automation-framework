package tests;

import org.testng.annotations.Test;
import base.BaseTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Epic("API Automation")
@Feature("Posts API")
public class TC11_Validate_Response_Body extends BaseTest {

    @Test
    @Story("Validate Response Body")
    @Description("Validate Response Body in post /posts endpoint")
    public void createPost() {

        String payload =
                "{ \"title\":\"API\" }";

        given()
                .contentType("application/json")
                .body(payload)
                .when()
                .post(BASE_URL + "/posts")
                .then()
                .statusCode(201)
                .body("title", equalTo("API"));
    }
}