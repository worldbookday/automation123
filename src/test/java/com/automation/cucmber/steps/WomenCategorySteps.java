package com.automation.cucmber.steps;

import com.automation.pages.HomePage;
import com.automation.pages.ProductPage;
import com.automation.pages.WomenCategoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class WomenCategorySteps {
    @Given("^I am in women category page$")
    public void iAmInWomenCategoryPage() {

    }

    @When("^I click on women tab$")
    public void iClickOnWomenTab() {
       new HomePage().clickOnWomanTab();


    }

    @Then("^I can successfully navigate on Women category page$")
    public void iCanSuccessfullyNavigateOnWomenCategoryPage() {
    }

    @And("^Verify \"([^\"]*)\" text is visible$")
    public void verifyTextIsVisible(String WOMEN)  {
      new HomePage().verifyWomenText("WOMEN");

           }


    @Then("^I click on the product \"([^\"]*)\"$")
    public void iClickOnTheProduct(String product) {
      new WomenCategoryPage().clickOnProductListTab(product);


    }

    @And("^I change quantity \"([^\"]*)\"$")
    public void iChangeQuantity(String qty) throws InterruptedException {
        new ProductPage().enterQuantityTab(qty);
        Thread.sleep(2000);


    }

    @And("^I select size \"([^\"]*)\"$")
    public void iSelectSize(String size) {
        new ProductPage().selectSizeDropDownTab(size);


    }

    @And("^I select colour \"([^\"]*)\"$")
    public void iSelectColour(String colour) {
        new ProductPage().clickOnColurCheckBox(colour);


    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddCartTab();
    }


    @And("^Verify the message Product successfully added to your shopping cart$")
    public void verifyTheMessageProductSuccessfullyAddedToYourShoppingCart() throws InterruptedException {
        Thread.sleep(2000);
        String expactedText="Product successfully added to your shopping cart";
        Assert.assertEquals("Displayed message is wrong : ",expactedText, new ProductPage().successFullyAddedgetverify());


    }

    @And("^I click on xbutton and close the popup$")
    public void iClickOnXbuttonAndCloseThePopup() {
        new ProductPage().clickOnCloseWindowTab();
    }
}
