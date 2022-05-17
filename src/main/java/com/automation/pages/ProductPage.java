package com.automation.pages;


import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.security.PublicKey;
import java.util.List;


public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement quantityField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='group_1']")
    WebElement sizeField;
    @CacheLookup
    @FindBy(xpath = "//a[@class=\"color_pick\"]")
    List<WebElement> colourField;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addCartButtonField;

    @FindBy(xpath = "//h2[normalize-space()='Product successfully added to your shopping cart'][1]")
    WebElement successMessageTextField;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close window']")
    WebElement closeWindowTAbField;

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    public void enterQuantityTab(String text) {
        quantityField.clear();
        sendTextToElement(quantityField, text);
    }

    public void selectSizeDropDownTab(String text) {
        Reporter.log("select Size from DropDown " + text + sizeField.toString() + "<br>");
        selectByVisibleTextFromDropDown(sizeField, text);
    }

    public void clickOnColurCheckBox(String text) {
        for (WebElement element : colourField) {
            if (element.getAttribute("title").equalsIgnoreCase(text)) {
                element.click();
                Reporter.log("click On Colour CheckBox " + "<br>");
                break;
            }
        }
    }

    public void clickOnAddCartTab() {
        Reporter.log("click On Add Cart Tab " + addCartButtonField.toString() + "<br>");
        clickOnElement(addCartButtonField);

    }

    public String successFullyAddedgetverify(){
        String message = getTextFromElement(successMessageTextField);
        return message;
    }
    public void successFullyAddedgetverifyText(String text) {
        Reporter.log("successfully Added get verify " + "<br>");
        verifyAssertText(successMessageTextField, text);
    }

    public void clickOnCloseWindowTab() {
        Reporter.log("click On Close Window Tab " + closeWindowTAbField.toString() + "<br>");
        clickOnElement(closeWindowTAbField);
    }


}
