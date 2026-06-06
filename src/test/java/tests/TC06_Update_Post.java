package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import base.BaseTest;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
import java.util.Map;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Epic("API Automation")
@Feature("Posts API")
public class TC06_Update_Post extends BaseTest{


    @Test
    @Story("Validate PUT")
    @Description("Validate PUT /posts/1 endpoint")
    public void updatePost() {
        Map<String,Object> payload = new HashMap<>();
        payload.put("title","Updated");
        payload.put("body","Updated Body");

        given()
                .body(payload)
                .when()
                .put(BASE_URL + "/posts/1")
                .then()
                .statusCode(200);

    }
}