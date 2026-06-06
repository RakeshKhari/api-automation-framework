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
public class TC10_Invalid_Endpoint extends BaseTest{


    @Test
    @Story("Validate Invalid Endpoint")
    @Description("Validate Invalid Endpoint /abc endpoint")
    public void invalidEndpoint() {

        given()
                .when()
                .get(BASE_URL + "/abc")
                .then()
                .statusCode(404);

    }
}