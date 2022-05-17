package com.automation.pages;


import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;


public class WomenCategoryPage extends Utility {
    private static final Logger log = LogManager.getLogger(WomenCategoryPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Women')]")
    WebElement womanTextField;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement topLinkField;
    @CacheLookup
    @FindBy(xpath = "//div[@class='block_content']//a[contains(@title,'Find your favorites dresses from our wide choice of evening, casual or summer dresses!')][normalize-space()='Dresses']")
    WebElement dressesLinkField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='selectProductSort']")
    WebElement sortByDropDownField;
    @CacheLookup
    @FindBy(xpath = "//h5[@itemprop=\"name\"]/child::a[@class=\"product-name\"]")
    List<WebElement> productListsField;

    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }

    public String womenTextGetVerify() {
        Reporter.log("women Text GetVerify : " + womanTextField.getText() + "<br>");
        return getTextFromElement(womanTextField);
    }

    public void clickOnTopsLinkTab() {
        clickOnElement(topLinkField);
        Reporter.log("click On Tops Link" + "<br>");

    }

    public void clickOnDressesLinkTab() {
        clickOnElement(dressesLinkField);
        Reporter.log("click On dresses Link" + "<br>");
    }

    public void clickOnShortByDropDown() {
        clickOnElement(sortByDropDownField);
        Reporter.log("click On sortBy DropDown" + "<br>");
    }

    public void clickOnProductListTab(String text) {
        for (WebElement element : productListsField) {
            if (element.getText().equalsIgnoreCase(text)) {
                element.click();
                Reporter.log("click On Product List: '" + text + "' On Product List" + "<br>");
                break;
            }
        }
    }


}


