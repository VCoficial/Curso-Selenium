package co.com.google.translate.steps;

import co.com.google.translate.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class GoogleHomePage {

    HomePage homePage;

    @Step
    public void opensGoogleTranslatePage(){
        homePage.open();
    }

    @Step
    public void enterTheWordToTranslate(String englishWord){
        homePage.enterTheWordToTranslate(englishWord);
        homePage.clickOnEnglishSourceButton();
    }

    @Step
    public void validationTheWordToTranslate(String resultWord){
        Assert.assertEquals(homePage.resultWordToTranslate(), resultWord);
    }
}
