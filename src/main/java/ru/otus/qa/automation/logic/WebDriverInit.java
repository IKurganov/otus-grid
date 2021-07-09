package ru.otus.qa.automation.logic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverInit {
    public static WebDriver initDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
