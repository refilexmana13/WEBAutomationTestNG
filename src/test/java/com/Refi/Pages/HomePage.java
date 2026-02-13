package com.Refi.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    By tshirtItem = By.xpath("//*[@id=\"item_1_title_link\"]/div");
    By titlePage = By.className("app_logo");

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean isTshirtItemDisplayed() {
        return driver.findElement(tshirtItem).isDisplayed();
    }

    public String getTitlePage() {
        return driver.findElement(titlePage).getText();
    }
}
