package com.automation.pages;


import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class HomePage extends Utility {
    private static final Logger log= LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//a[@title='Women']")
    WebElement womenTabField;
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    WebElement tshirtField;
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement dressesField;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signInLinkField;
    @CacheLookup
    @FindBy(xpath = "//img[@alt=\"My Store\"]")
    WebElement logoField;
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnWomanTab() {
        Reporter.log("click On women tab "+womenTabField.toString()+"<br>");
        clickOnElement(womenTabField);
    }
    public void verifyWomenText(String text) {
        Reporter.log("Women Text Verify Message"+"<br>");
        verifyAssertText(womenTabField, text);
    }

    public void clickOnDressesTab() {
        Reporter.log("click On dress tab "+dressesField.toString()+"<br>");
        clickOnElement(dressesField);
    }

    public void clickOnTshirtTab() {
        Reporter.log("click On Tshirt tab "+tshirtField.toString()+"<br>");
        clickOnElement(tshirtField);
    }

    public void clickOnSignInLink() {
        Reporter.log("click On Sign in link "+signInLinkField.toString()+"<br>");
        clickOnElement(signInLinkField);
    }

    public boolean signInLinkDisplay() {
        Reporter.log("signIn Link Display"+"<br>");
        return signInLinkField.isDisplayed();
    }

    public void clickOnLogoImage() {
        Reporter.log("click On Logo Image "+logoField.toString()+"<br>");
        clickOnElement(logoField);
    }


}
