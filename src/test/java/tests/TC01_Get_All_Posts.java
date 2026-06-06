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
public class TC01_Get_All_Posts extends BaseTest {

 @Test
 @Story("Get All Posts")
 @Description("Validate GET /posts endpoint")
 public void getAllPosts() {

  Response response =
          RestAssured
                  .given()
                  .when()
                  .get("https://jsonplaceholder.typicode.com/posts");

  response.then().statusCode(200);
 }
}