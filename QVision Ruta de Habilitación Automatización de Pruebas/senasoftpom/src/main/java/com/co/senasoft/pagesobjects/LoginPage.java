package com.co.senasoft.pagesobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
@DefaultUrl("https://izyacademy.com/")
public class LoginPage extends PageObject {

By BTN_LOGIN = By.xpath("//*[text()='Inicio de Sesión']");
By TXT_USERNAMME = By.xpath("//input[@name='username']");
By TXT_PASSWORD = By.xpath("//input[@name='password']");
By BTN_ACCEDER = By.xpath("//button[text()='Acceder']");
By LBL_CAPTURE_MESSAGE = By.xpath("//*[text()='Acceso inválido. Por favor, inténtelo otra vez. ']");


    public By getBTN_LOGIN() {
        return BTN_LOGIN;
    }

    public By getTXT_USERNAMME() {
        return TXT_USERNAMME;
    }

    public By getTXT_PASSWORD() {
        return TXT_PASSWORD;
    }

    public By getBTN_ACCEDER() {
        return BTN_ACCEDER;
    }

    public By getLBL_CAPTURE_MESSAGE() {
        return LBL_CAPTURE_MESSAGE;
    }
}
