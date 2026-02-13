package com.Refi.stepDef;

import com.Refi.BaseTest;
import com.Refi.Pages.HomePage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomeStepDef extends BaseTest {

    HomePage homePage;

    @Then("I should be redirected to the dashboard")
    public void iShouldBeRedirectedToTheDashboard() {
        homePage =  new HomePage(driver);
        Assert.assertTrue(homePage.isTshirtItemDisplayed());
        Assert.assertEquals(homePage.getTitlePage(), "Swag Labs");
    }
}
