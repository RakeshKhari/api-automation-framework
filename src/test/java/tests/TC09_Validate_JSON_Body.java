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
public class TC09_Validate_JSON_Body extends BaseTest {

    @Test
    @Story("Validate BODY")
    @Description("Validate Body in GET /posts/1 endpoint")
    public void validateBody() {

        given()
                .when()
                .get(BASE_URL + "/posts/1")
                .then()
                .body("id", equalTo(1));

    }
}