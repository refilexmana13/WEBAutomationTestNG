package com.Refi.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By inputTextUsername = By.cssSelector("input#user-name");
    By inputTextPassword = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.id("login-button");
    By errorMessage = By.cssSelector("h3[data-test='error']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void enterUsername(String username) {
        driver.findElement(inputTextUsername).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(inputTextPassword).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}
