package com.co.senasoft.stepsdefinitions;


import com.co.senasoft.pagesobjects.LoginPage;
import com.co.senasoft.steps.LoginStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {

    @Steps
    LoginStep loginStep;

    @Given("^he user is on the page$")
    public void heUserIsOnThePage() {
        loginStep.openBrowser();
    }

    @When("^he user enter data$")
    public void heUserEnterData() {
        loginStep.clickSesion();
        loginStep.enterCredentials();
        loginStep.clickAcceder();
    }

    @Then("^he could see login successful$")
    public void heCouldSeeLoginSuccessful() {

        loginStep.validationMessage();
    }


}
