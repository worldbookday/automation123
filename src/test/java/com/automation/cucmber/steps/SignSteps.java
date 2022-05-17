package com.automation.cucmber.steps;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class SignSteps {

    @When("^I click on Sign in Link$")
    public void iClickOnSignInLink() {
        new HomePage().clickOnSignInLink();
    }

    @Then("^I should be navigated to signIn page successfully$")
    public void iShouldBeNavigatedToSignInPageSuccessfully() {
    }

    @And("^Verify that \"([^\"]*)\" message is displayed$")
    public void verifyThatMessageIsDisplayed(String message)  {
        new SignInPage().authenticationText(message);

    }

    @And("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username)  {
       new SignInPage().enterEmailTab(username);


    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password1)  {
        new SignInPage().enterPasswordTab(password1);

    }

    @And("^I click on sign in Button$")
    public void iClickOnSignInButton() {
        new SignInPage().clickOnSignInButtonTab();
    }


    @Then("^Check error message is displayed \"([^\"]*)\"$")
    public void checkErrorMessageIsDisplayed(String message)  {
        new SignInPage().getErrorMessage(message);
    }


    @Then("^Verify that sing out link should be displayed$")
    public void verifyThatSingOutLinkShouldBeDisplayed() {
        Assert.assertTrue(new CreateAccountPage().signOutLinkDisplayed());

    }

    @Given("^I am in home page$")
    public void iAmInHomePage() {
    }


    @And("^I click on signin Button$")
    public void iClickOnSigninButton() {
       new SignInPage().clickOnSignInButtonTab();
    }

    @And("^I click on sign Out link$")
    public void iClickOnSignOutLink() throws InterruptedException {
        Thread.sleep(1000);
        new CreateAccountPage().clickOnSignOutLink();
    }

    @Then("^I am able to log out successfully$")
    public void iAmAbleToLogOutSuccessfully() throws InterruptedException {
       Thread.sleep(1000);
        new CreateAccountPage().clickOnSignOutLink();
    }

    @And("^Verify that sing in link should be displayed$")
    public void verifyThatSingInLinkShouldBeDisplayed() {
        Assert.assertTrue(new HomePage().signInLinkDisplay());
    }


}
