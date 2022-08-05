package com.co.senasoft.steps;

import com.co.senasoft.pagesobjects.LoginPage;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class LoginStep {
    LoginPage loginPage = new LoginPage();

    @Step
    public void openBrowser() {
        loginPage.open();
    }

    @Step
    public void clickSesion() {
        loginPage.getDriver().findElement(loginPage.getBTN_LOGIN()).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void enterCredentials() {
        loginPage.getDriver().findElement(loginPage.getTXT_USERNAMME()).sendKeys("mbuitragoa");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginPage.getDriver().findElement(loginPage.getTXT_PASSWORD()).sendKeys("12323424231");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Step
    public void clickAcceder() {
        loginPage.getDriver().findElement(loginPage.getBTN_ACCEDER()).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void validationMessage(){

     Assert.assertThat(loginPage.getDriver().findElement(loginPage.getLBL_CAPTURE_MESSAGE()).isDisplayed()
     ,Matchers.is(true));

      //  Assert.assertThat(loginPage.getDriver().
        //        findElement(loginPage.getLBL_CAPTURE_MESSAGE()).isDisplayed(), Matchers.is(true));

    }
}
