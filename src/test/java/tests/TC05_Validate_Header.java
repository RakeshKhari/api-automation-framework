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
public class TC05_Validate_Header extends BaseTest {

    @Test
    @Story("Validate Header")
    @Description("Validate Header in get /posts endpoint")
    public void validateHeader() {

        given()
                .when()
                .get(BASE_URL + "/posts")
                .then()
                .statusCode(200)
                .header("Content-Type", containsString("application/json"));

    }
}
