package com.automation.cucmber.steps;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateAccountSteps {
    @Given("^I am on Sign in page$")
    public void iAmOnSignInPage() {
        new HomePage().clickOnSignInLink();

    }

    @And("^I click on create an account button$")
    public void iClickOnCreateAnAccountButton() {
      new SignInPage().clickOnCreateAnAccountButtonTab();


    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String FName) {
        new CreateAccountPage().enterFirstName(FName);





    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String LName)  {
        new CreateAccountPage().enterlastName(LName);

    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email)  {
        new SignInPage().enterEmailForCreateAccount(email);


    }

    @And("^I enter other password \"([^\"]*)\"$")
    public void iEnterOtherPassword(String password)  {
       new CreateAccountPage().enterPassword(password);



    }

    @And("^I enter address in address field \"([^\"]*)\"$")
    public void iEnterAddressInAddressField(String address)  {
        new CreateAccountPage().enterAddress1FromAddressTab(address);


    }

    @And("^I enter city in city field \"([^\"]*)\"$")
    public void iEnterCityInCityField(String city)  {
        new CreateAccountPage().enterCityFromAddressTab(city);


    }

    @And("^I select State from dropdown \"([^\"]*)\"$")
    public void iSelectStateFromDropdown(String State)  {
        new CreateAccountPage().selectStateFromDropDown(State);


    }

    @And("^I enter Zip code \"([^\"]*)\"$")
    public void iEnterZipCode(String Zipcode)  {
        new CreateAccountPage().enterZipCode(Zipcode);


    }

    @And("^I select country from dropdown \"([^\"]*)\"$")
    public void iSelectCountryFromDropdown(String Country)  {
        new CreateAccountPage().selectCountryFromDropDown(Country);


    }

    @And("^I enter Home phone number \"([^\"]*)\"$")
    public void iEnterHomePhoneNumber(String Homephonenumber)  {
        new CreateAccountPage().enterHomePhoneNumber(Homephonenumber);


    }





    @And("^I enter Future Reference Address \"([^\"]*)\"$")
    public void iEnterFutureReferenceAddress(String ReferenceAddress)  {
        new CreateAccountPage().enterFutureReferenceAddress(ReferenceAddress);


    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new CreateAccountPage().clickOnRegisterField();
    }




    @Then("^I should be able to register successfully$")
    public void iShouldBeAbleToRegisterSuccessfully() {

    }

    @And("^Verify \"([^\"]*)\" message is displayed$")
    public void verifyMessageIsDisplayed(String Message1)  {
        new CreateAccountPage().getMyAccountText(Message1);


    }



}

