package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class CreateAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());
    @CacheLookup
    @FindBy(name = "id_gender")
    WebElement radioButtonField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passWordField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='days']")
    WebElement dateDropDownField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='months']")
    WebElement monthdropDownField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='years']")
    WebElement yearDropDownField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement yourAddressFirstNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement yourAddressLastNameFeild;
    @CacheLookup
    @FindBy(xpath = "//input[@id='company']")
    WebElement yourCompanyField;
    @CacheLookup
    @FindBy(id = "address1")
    WebElement address1Field;
    @CacheLookup
    @FindBy(id = "address2")
    WebElement address2Field;
    @CacheLookup
    @FindBy(xpath = "//input[@id='city']")
    WebElement cityField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement stateDropDownField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement zipPostalCodeField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement countryDropDownField;
    @CacheLookup
    @FindBy(xpath = "//textarea[@id='other']")
    WebElement additionalInformationField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='phone']")
    WebElement homePhoneField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobileNumberField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='alias']")
    WebElement assignAnAddresForFutureReferenceField;
    @CacheLookup
    @FindBy(xpath = "//button[@id='submitAccount']")
    WebElement registerButtonField;
    @CacheLookup
    @FindBy(xpath = "//h1[@class='page-heading']")
    WebElement myAccountTextField;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Log me out']")
    WebElement signOutLinkField;

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickRadioButton() {
        Reporter.log("click On radio button " + radioButtonField.toString() + "<br>");
        clickOnElement(radioButtonField);
    }

    public void enterFirstName(String text) {
        Reporter.log("enter First Name " + text + firstNameField.toString() + "<br>");
        sendTextToElement(firstNameField, text);
    }

    public void enterlastName(String text) {
        Reporter.log("enter last Name " + text + lastNameField.toString() + "<br>");
        sendTextToElement(lastNameField, text);
    }

    public void enterEmail(String text) {
        Reporter.log("enter email " + text + emailField.toString() + "<br>");
        sendTextToElement(emailField, text);
    }

    public void enterPassword(String text) {
        Reporter.log("enter Amount Tab " + text + passWordField.toString() + "<br>");
        sendTextToElement(passWordField, text);
    }


    public void selectDateFromDropDown(String text) {
        Reporter.log("select Date From DropDown " + text + dateDropDownField.toString() + "<br>");
        selectByVisibleTextFromDropDown(dateDropDownField, text);
    }


    public void selectMonthFromDropDown(String text) {
        Reporter.log("select Month From DropDown " + text + monthdropDownField.toString() + "<br>");
        selectByVisibleTextFromDropDown(monthdropDownField, text);
    }


    public void selectYearFromDropDown(String text) {
        Reporter.log("select Year From DropDown " + text + yearDropDownField.toString() + "<br>");
        selectByVisibleTextFromDropDown(yearDropDownField, text);
    }

    public void enterFirstNameInAddressTab(String text) {
        Reporter.log("enter First Name " + text + yourAddressFirstNameField.toString() + "<br>");
        sendTextToElement(yourAddressFirstNameField, text);

    }

    public void enterLastNameInAddressTab(String text) {
        Reporter.log("enter Last Name " + text + yourAddressLastNameFeild.toString() + "<br>");
        sendTextToElement(yourAddressLastNameFeild, text);
    }

    public void enterCompanyNameInAddressTab(String text) {
        Reporter.log("enter company Name " + text + yourCompanyField.toString() + "<br>");
        sendTextToElement(yourCompanyField, text);
    }

    public void enterAddress1FromAddressTab(String text) {
        Reporter.log("enter Address1 " + text + address1Field.toString() + "<br>");
        sendTextToElement(address1Field, text);
    }

    public void enterAddress2FromAddressTab(String text) {
        Reporter.log("enter Address2 Tab " + text + address2Field.toString() + "<br>");
        sendTextToElement(address2Field, text);
    }

    public void enterCityFromAddressTab(String text) {
        Reporter.log("enter city from address field " + text + cityField.toString() + "<br>");
        sendTextToElement(cityField, text);
    }


    public void selectStateFromDropDown(String text) {
        Reporter.log("select State From DropDown " + text + stateDropDownField.toString() + "<br>");
        selectByVisibleTextFromDropDown(stateDropDownField, text);
    }

    public void enterZipCode(String text) {
        Reporter.log("enter Zip Code " + text + zipPostalCodeField.toString() + "<br>");
        sendTextToElement(zipPostalCodeField, text);
    }


    public void selectCountryFromDropDown(String text) {
        Reporter.log("select Country From DropDown " + text + countryDropDownField.toString() + "<br>");
        selectByVisibleTextFromDropDown(countryDropDownField, text);
    }

    public void enterAdditionalInformation(String text) {
        Reporter.log("enter additional Information " + text + additionalInformationField.toString() + "<br>");
        sendTextToElement(additionalInformationField, text);
    }

    public void enterHomePhoneNumber(String text) {
        Reporter.log("enter Home Phone Number " + text + homePhoneField.toString() + "<br>");
        sendTextToElement(homePhoneField, text);
    }

    public void enterMobilePhoneNumber(String text) {
        Reporter.log("enter Mobile Phone Number " + text + mobileNumberField.toString() + "<br>");
        sendTextToElement(mobileNumberField, text);
    }

    public void enterFutureReferenceAddress(String text) {
        Reporter.log("enter Future Reference Address " + text + assignAnAddresForFutureReferenceField.toString() + "<br>");
        sendTextToElement(assignAnAddresForFutureReferenceField, text);
    }

    public void clickOnRegisterField() {
        Reporter.log("click On register field " + registerButtonField.toString() + "<br>");
        clickOnElement(registerButtonField);

    }

    public void getMyAccountText(String text) {
        Reporter.log("get My Account Text Verify" + "<br>");
        verifyAssertText(myAccountTextField, text);
    }

    public Boolean signOutLinkDisplayed() {
        Reporter.log("signOut Link Displayed" + "<br>");
        return signOutLinkField.isDisplayed();
    }

    public void clickOnSignOutLink() {
        Reporter.log("click On Sign out link " + signOutLinkField.toString() + "<br>");
        clickOnElement(signOutLinkField);

    }


}
