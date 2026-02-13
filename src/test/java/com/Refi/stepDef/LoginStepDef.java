package com.Refi.stepDef;

import com.Refi.BaseTest;
import com.Refi.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStepDef extends BaseTest {

    protected LoginPage loginPage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();

    }

    @When("I enter valid username {string}")
    public void iEnterValidUsername(String username) {
        loginPage.enterUsername(username);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
        loginPage.clickLoginButton();
    }


    @Then("I should see an alert message {string}")
    public void iShouldSeeAnAlertMessage(String alertMessage) {
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertEquals(actualMessage, alertMessage);
    }
}
