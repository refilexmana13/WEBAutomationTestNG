package com.Refi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected static WebDriver driver;

    protected void getDriver (){
        // menggunakan Microsoft Edge sebagai browsernya
        driver = WebDriverManager.chromedriver().create();
    }
}
