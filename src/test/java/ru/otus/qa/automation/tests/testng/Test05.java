package ru.otus.qa.automation.tests.testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.otus.qa.automation.logic.pages.MainPage;

import static ru.otus.qa.automation.logic.WebDriverInit.initDriver;

public class Test05 {
    private WebDriver driver;
    private MainPage mainPage;

    @BeforeMethod
    void setUp(){
        driver = initDriver();
        mainPage = new MainPage(driver);
        driver.get("https://otus.ru");
    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }

    @Test
    void test05(){
        mainPage
                .someButton();
    }
}
