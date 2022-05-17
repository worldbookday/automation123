$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WomenCategory.feature");
formatter.feature({
  "line": 1,
  "name": "Women Category page test",
  "description": "\r\nAs user I want to buy some  products on automation practice website page",
  "id": "women-category-page-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "verify User Should Add Product To The Cart Successfully",
  "description": "",
  "id": "women-category-page-test;verify-user-should-add-product-to-the-cart-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@sanity"
    },
    {
      "line": 16,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I am in women category page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I click on women tab",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I click on the product \"\u003cproduct\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I change quantity \"\u003cqty\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select size \"\u003csize\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select colour \"\u003ccolour\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Verify the message Product successfully added to your shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on xbutton and close the popup",
  "keyword": "And "
});
formatter.examples({
  "line": 28,
  "name": "",
  "description": "",
  "id": "women-category-page-test;verify-user-should-add-product-to-the-cart-successfully;",
  "rows": [
    {
      "cells": [
        "product",
        "qty",
        "size",
        "colour"
      ],
      "line": 29,
      "id": "women-category-page-test;verify-user-should-add-product-to-the-cart-successfully;;1"
    },
    {
      "cells": [
        "Blouse",
        "2",
        "M",
        "White"
      ],
      "line": 30,
      "id": "women-category-page-test;verify-user-should-add-product-to-the-cart-successfully;;2"
    },
    {
      "cells": [
        "Printed Dress",
        "3",
        "L",
        "Orange"
      ],
      "line": 31,
      "id": "women-category-page-test;verify-user-should-add-product-to-the-cart-successfully;;3"
    },
    {
      "cells": [
        "Printed Chiffon Dress",
        "4",
        "S",
        "Green"
      ],
      "line": 32,
      "id": "women-category-page-test;verify-user-should-add-product-to-the-cart-successfully;;4"
    },
    {
      "cells": [
        "Printed Summer Dress with price $28.98",
        "2",
        "M",
        "Blue"
      ],
      "line": 33,
      "id": "women-category-page-test;verify-user-should-add-product-to-the-cart-successfully;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8213307499,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "user is on women category page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 30,
  "name": "verify User Should Add Product To The Cart Successfully",
  "description": "",
  "id": "women-category-page-test;verify-user-should-add-product-to-the-cart-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@regression"
    },
    {
      "line": 16,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I am in women category page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I click on women tab",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I click on the product \"Blouse\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I change quantity \"2\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select size \"M\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select colour \"White\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Verify the message Product successfully added to your shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on xbutton and close the popup",
  "keyword": "And "
});
formatter.match({
  "location": "WomenCategorySteps.iAmInWomenCategoryPage()"
});
formatter.result({
  "duration": 72138101,
  "status": "passed"
});
formatter.match({
  "location": "WomenCategorySteps.iClickOnWomenTab()"
});
formatter.result({
  "duration": 2567559299,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blouse",
      "offset": 24
    }
  ],
  "location": "WomenCategorySteps.iClickOnTheProduct(String)"
});
formatter.result({
  "duration": 2834904499,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 19
    }
  ],
  "location": "WomenCategorySteps.iChangeQuantity(String)"
});
formatter.result({
  "duration": 2100850700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "M",
      "offset": 15
    }
  ],
  "location": "WomenCategorySteps.iSelectSize(String)"
});
formatter.result({
  "duration": 78346000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "White",
      "offset": 17
    }
  ],
  "location": "WomenCategorySteps.iSelectColour(String)"
});
formatter.result({
  "duration": 75634500,
  "status": "passed"
});
formatter.match({
  "location": "WomenCategorySteps.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 44242600,
  "status": "passed"
});
formatter.match({
  "location": "WomenCategorySteps.verifyTheMessageProductSuccessfullyAddedToYourShoppingCart()"
});
formatter.result({
  "duration": 2068010601,
  "status": "passed"
});
formatter.match({
  "location": "WomenCategorySteps.iClickOnXbuttonAndCloseThePopup()"
});
formatter.result({
  "duration": 35471301,
  "status": "passed"
});
formatter.after({
  "duration": 649968899,
  "status": "passed"
});
formatter.before({
  "duration": 4526159100,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "user is on women category page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 31,
  "name": "verify User Should Add Product To The Cart Successfully",
  "description": "",
  "id": "women-category-page-test;verify-user-should-add-product-to-the-cart-successfully;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@regression"
    },
    {
      "line": 16,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I am in women category page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I click on women tab",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I click on the product \"Printed Dress\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I change quantity \"3\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select size \"L\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select colour \"Orange\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Verify the message Product successfully added to your shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on xbutton and close the popup",
  "keyword": "And "
});
formatter.match({
  "location": "WomenCategorySteps.iAmInWomenCategoryPage()"
});
formatter.result({
  "duration": 19899,
  "status": "passed"
});
formatter.match({
  "location": "WomenCategorySteps.iClickOnWomenTab()"
});
formatter.result({
  "duration": 2024650400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Dress",
      "offset": 24
    }
  ],
  "location": "WomenCategorySteps.iClickOnTheProduct(String)"
});
formatter.result({
  "duration": 1619956500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 19
    }
  ],
  "location": "WomenCategorySteps.iChangeQuantity(String)"
});
formatter.result({
  "duration": 2077316000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "L",
      "offset": 15
    }
  ],
  "location": "WomenCategorySteps.iSelectSize(String)"
});
formatter.result({
  "duration": 62343700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Orange",
      "offset": 17
    }
  ],
  "location": "WomenCategorySteps.iSelectColour(String)"
});
formatter.result({
  "duration": 20034243700,
  "status": "passed"
});
formatter.match({
  "location": "WomenCategorySteps.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 44302100,
  "status": "passed"
});
formatter.match({
  "location": "WomenCategorySteps.verifyTheMessageProductSuccessfullyAddedToYourShoppingCart()"
});
formatter.result({
  "duration": 2045719400,
  "status": "passed"
});
formatter.match({
  "location": "WomenCategorySteps.iClickOnXbuttonAndCloseThePopup()"
});
formatter.result({
  "duration": 29066599,
  "status": "passed"
});
formatter.after({
  "duration": 643983299,
  "status": "passed"
});
formatter.before({
  "duration": 5054167499,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "user is on women category page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 32,
  "name": "verify User Should Add Product To The Cart Successfully",
  "description": "",
  "id": "women-category-page-test;verify-user-should-add-product-to-the-cart-successfully;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@regression"
    },
    {
      "line": 16,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I am in women category page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I click on women tab",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I click on the product \"Printed Chiffon Dress\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I change quantity \"4\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select size \"S\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select colour \"Green\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Verify the message Product successfully added to your shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on xbutton and close the popup",
  "keyword": "And "
});
formatter.match({
  "location": "WomenCategorySteps.iAmInWomenCategoryPage()"
});
formatter.result({
  "duration": 61700,
  "status": "passed"
});
formatter.match({
  "location": "WomenCategorySteps.iClickOnWomenTab()"
});
formatter.result({
  "duration": 2813043300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Chiffon Dress",
      "offset": 24
    }
  ],
  "location": "WomenCategorySteps.iClickOnTheProduct(String)"
});
formatter.result({
  "duration": 3244814700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 19
    }
  ],
  "location": "WomenCategorySteps.iChangeQuantity(String)"
});
formatter.result({
  "duration": 2090652199,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "S",
      "offset": 15
    }
  ],
  "location": "WomenCategorySteps.iSelectSize(String)"
});
formatter.result({
  "duration": 29284601,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Green",
      "offset": 17
    }
  ],
  "location": "WomenCategorySteps.iSelectColour(String)"
});
formatter.result({
  "duration": 61052200,
  "status": "passed"
});
formatter.match({
  "location": "WomenCategorySteps.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 47144100,
  "status": "passed"
});
formatter.match({
  "location": "WomenCategorySteps.verifyTheMessageProductSuccessfullyAddedToYourShoppingCart()"
});
formatter.result({
  "duration": 2052259101,
  "status": "passed"
});
formatter.match({
  "location": "WomenCategorySteps.iClickOnXbuttonAndCloseThePopup()"
});
formatter.result({
  "duration": 29543800,
  "status": "passed"
});
formatter.after({
  "duration": 649573500,
  "status": "passed"
});
formatter.before({
  "duration": 4644772300,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "user is on women category page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 33,
  "name": "verify User Should Add Product To The Cart Successfully",
  "description": "",
  "id": "women-category-page-test;verify-user-should-add-product-to-the-cart-successfully;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@regression"
    },
    {
      "line": 16,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I am in women category page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I click on women tab",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I click on the product \"Printed Summer Dress with price $28.98\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I change quantity \"2\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select size \"M\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select colour \"Blue\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Verify the message Product successfully added to your shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on xbutton and close the popup",
  "keyword": "And "
});
formatter.match({
  "location": "WomenCategorySteps.iAmInWomenCategoryPage()"
});
formatter.result({
  "duration": 19700,
  "status": "passed"
});
formatter.match({
  "location": "WomenCategorySteps.iClickOnWomenTab()"
});
formatter.result({
  "duration": 2655748199,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Summer Dress with price $28.98",
      "offset": 24
    }
  ],
  "location": "WomenCategorySteps.iClickOnTheProduct(String)"
});
formatter.result({
  "duration": 72254200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 19
    }
  ],
  "location": "WomenCategorySteps.iChangeQuantity(String)"
});
formatter.result({
  "duration": 20021093701,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id\u003d\u0027quantity_wanted\u0027]\"}\n  (Session info: chrome\u003d101.0.4951.67)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027DESKTOP-EVK1CL3\u0027, ip: \u0027192.168.1.188\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [638976c8cec36be1481e1fe88e93a41d, findElement {using\u003dxpath, value\u003d//input[@id\u003d\u0027quantity_wanted\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 101.0.4951.67, chrome: {chromedriverVersion: 101.0.4951.41 (93c720db8323..., userDataDir: C:\\Users\\home\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:50821}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:50821/devtoo..., se:cdpVersion: 101.0.4951.67, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 638976c8cec36be1481e1fe88e93a41d\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:383)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:375)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy23.clear(Unknown Source)\r\n\tat com.automation.pages.ProductPage.enterQuantityTab(ProductPage.java:44)\r\n\tat com.automation.cucmber.steps.WomenCategorySteps.iChangeQuantity(WomenCategorySteps.java:45)\r\n\tat ✽.And I change quantity \"2\"(WomenCategory.feature:21)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "M",
      "offset": 15
    }
  ],
  "location": "WomenCategorySteps.iSelectSize(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Blue",
      "offset": 17
    }
  ],
  "location": "WomenCategorySteps.iSelectColour(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WomenCategorySteps.iClickOnAddToCartButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WomenCategorySteps.verifyTheMessageProductSuccessfullyAddedToYourShoppingCart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WomenCategorySteps.iClickOnXbuttonAndCloseThePopup()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 927400299,
  "status": "passed"
});
});