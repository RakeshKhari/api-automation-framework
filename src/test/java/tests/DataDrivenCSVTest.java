package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.CsvDataProvider;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Epic("API Automation")
@Feature("Posts API")
public class DataDrivenCSVTest {

    @DataProvider(name = "csvData")
    public Object[][] getData() throws Exception {
        return CsvDataProvider.readCsv("testdata/users.csv");
    }

    @Test(dataProvider = "csvData")
    public void createPost(String title, String body) {

        System.out.println("Title: " + title);
        System.out.println("Body : " + body);
    }
}