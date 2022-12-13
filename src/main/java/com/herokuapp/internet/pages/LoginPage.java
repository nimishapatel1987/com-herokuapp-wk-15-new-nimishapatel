package com.herokuapp.internet.pages;

import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(name = "username")
    WebElement usernameField;
    public void enterUsername(String userName) {
        sendTextToElement(usernameField, userName);
    }

    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(tagName = "i")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/h2[1]")
    WebElement secureAreaText;

    @CacheLookup
    @FindBy(name = "username")
    WebElement invalidUserNameField;


    @CacheLookup
    @FindBy(name = "password")
    WebElement validPasswordField;

    @CacheLookup
    @FindBy(tagName = "i")
    WebElement loginButton1;

    @CacheLookup
    @FindBy(xpath = "//div[@id='flash-messages']//div[1]")
    WebElement yourUsernameIsInvalid;

    @CacheLookup
    @FindBy(name = "username")
    WebElement validUserNameField;

    @CacheLookup
    @FindBy(name = "password")
    WebElement invalidPasswordField;

    @CacheLookup
    @FindBy(tagName = "i")
    WebElement loginButton2;

    @CacheLookup
    @FindBy(xpath = "//div[@id='flash-messages']//div[1]")
    WebElement yourPasswordIsInvalid;

//    public void enterUsername(String userName) {
//        sendTextToElement(usernameField, userName);
//    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getTextSecureArea() {
        return getTextFromElement(secureAreaText);
    }

    public void invalidUsername(String userName) {
        sendTextToElement(invalidUserNameField, userName);
    }

    public void validPassword(String password) {
        sendTextToElement(validPasswordField, password);
    }

    public void clickOnLoginButton1() {
        clickOnElement(loginButton1);
    }

    public String getErrorMessage() {
        return getTextFromElement(yourUsernameIsInvalid);

    }

    public void validUsername(String userName) {
        sendTextToElement(validUserNameField, userName);
    }

    public void invalidPassword(String password) {
        sendTextToElement(invalidPasswordField, password);
    }

    public void clickOnLoginButton2() {
        clickOnElement(loginButton2);
    }

    public String getErrorMessageForInvalidPassword() {
        return getTextFromElement(yourPasswordIsInvalid);
    }
}
