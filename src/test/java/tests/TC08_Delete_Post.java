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
public class TC08_Delete_Post extends BaseTest {

    @Test
    @Story("Validate DELETE")
    @Description("Validate DELETE /posts/1 endpoint")
    public void deletePost() {

        given()
                .when()
                .delete(BASE_URL + "/posts/1")
                .then()
                .statusCode(200);

    }
}