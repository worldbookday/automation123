package com.automation.pages;


import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class SignInPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailAddressField;
    @CacheLookup
    @FindBy(id = "passwd")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElement signInButtonField;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement authenticationTextField;
    @CacheLookup
    @FindBy(xpath = "//h3[contains(text(),'Create an account')]")
    WebElement createAccountTextField;
    @CacheLookup
    @FindBy(xpath = "//button[@id=\"SubmitCreate\"]")
    WebElement createAnAccountButtonField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement entertrEmailAddressToCreateField;
    @CacheLookup
    @FindBy(xpath = "//div[@class=\"alert alert-danger\"]/descendant::li")
    WebElement errorMessageField;
    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    public void enterEmailForCreateAccount(String email) {
        Reporter.log("enter Amount Tab " + email + entertrEmailAddressToCreateField.toString() + "<br>");
        sendTextToElement(entertrEmailAddressToCreateField, email);
    }

    public void clickOnCreateAnAccountButtonTab() {
        Reporter.log("click On Create An Account Button " + createAnAccountButtonField.toString() + "<br>");
        clickOnElement(createAnAccountButtonField);
    }

    public void enterEmailTab(String email1) {
        Reporter.log("enter Email Tab " + email1 + emailAddressField.toString() + "<br>");

        sendTextToElement(emailAddressField, email1);
    }

    public void enterPasswordTab(String password) {
        Reporter.log("enter Password Tab " + password + passwordField.toString() + "<br>");

        sendTextToElement(passwordField, password);
    }

    public void authenticationText(String text) {
        Reporter.log("authentication Text Message Verify" + "<br>");

        verifyAssertText(authenticationTextField, text);

    }

    public void createAnAccountText(String text) {
        Reporter.log("create An Account Text verify message" + "<br>");


        verifyAssertText(createAccountTextField, text);
    }

    public void clickOnSignInButtonTab() {
        Reporter.log("click On Sign In Button Tab " + signInButtonField.toString() + "<br>");
        clickOnElement(signInButtonField);
    }

    public void getErrorMessage(String text) {
        Reporter.log("get Error Message Verify" + "<br>");
        verifyAssertText(errorMessageField, text);
    }


}





