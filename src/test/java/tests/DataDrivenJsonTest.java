package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.JsonUtils;

import java.util.HashMap;
import java.util.Map;
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
public class DataDrivenJsonTest {

    @DataProvider(name = "jsonData")
    public Object[][] getData() throws Exception {

        return JsonUtils.readJson("testdata/users.json");
    }

    @Test(dataProvider = "jsonData")
    public void createPost(String title, String body) {

        Map<String, Object> payload = new HashMap<>();
        payload.put("title", title);
        payload.put("body", body);

        Response response =
                RestAssured
                        .given()
                        .contentType("application/json")
                        .body(payload)
                        .when()
                        .post("https://jsonplaceholder.typicode.com/posts");

        response.then().statusCode(201);

        System.out.println("Created Post:");
        System.out.println("Title : " + title);
        System.out.println("Body  : " + body);
    }
}