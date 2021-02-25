$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources%E2%80%A8/features/US06_TC001.feature");
formatter.feature({
  "name": "US006",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TC001"
    },
    {
      "name": "@FRY"
    }
  ]
});
formatter.scenarioOutline({
  "name": "TC001 User Info Being Populated When Navigating User Info",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User goes to \"url\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks people image",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks main page sign in button",
  "keyword": "And "
});
formatter.step({
  "name": "User enters username \"\u003cUsername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks sign in button",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks profile image",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks User Info",
  "keyword": "And "
});
formatter.step({
  "name": "User verifies firstname",
  "keyword": "And "
});
formatter.step({
  "name": "User verifies lastname",
  "keyword": "And "
});
formatter.step({
  "name": "User verifes email",
  "keyword": "And "
});
formatter.step({
  "name": "User verifies language",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "team35GmiBankProject",
        "team35GmiBankProject"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC001 User Info Being Populated When Navigating User Info",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC001"
    },
    {
      "name": "@FRY"
    }
  ]
});
formatter.step({
  "name": "User goes to \"url\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_goes_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks people image",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clicks_people_image()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks main page sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clicks_main_page_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username \"team35GmiBankProject\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_enters_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password \"team35GmiBankProject\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_enters_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clicks_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks profile image",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clicks_profile_image()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks User Info",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clicks_User_Info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies firstname",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_verifies_firstname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies lastname",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_verifies_lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifes email",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_verifes_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies language",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_verifies_language()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "There Should be  Two Language Avaible Eng and Tur",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC002"
    },
    {
      "name": "@FRY"
    }
  ]
});
formatter.step({
  "name": "User goes to \"url\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks people image",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks main page sign in button",
  "keyword": "And "
});
formatter.step({
  "name": "User enters username \"\u003cUsername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks sign in button",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks profile image",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks User Info",
  "keyword": "And "
});
formatter.step({
  "name": "User change language",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks save button",
  "keyword": "And "
});
formatter.step({
  "name": "User verifies settings are changing",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "team35GmiBankProject",
        "team35GmiBankProject"
      ]
    }
  ]
});
formatter.scenario({
  "name": "There Should be  Two Language Avaible Eng and Tur",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC001"
    },
    {
      "name": "@FRY"
    },
    {
      "name": "@TC002"
    },
    {
      "name": "@FRY"
    }
  ]
});
formatter.step({
  "name": "User goes to \"url\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_goes_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks people image",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clicks_people_image()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks main page sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clicks_main_page_sign_in_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[normalize-space()\u003d\u0027Sign in\u0027]\"}\n  (Session info: chrome\u003d88.0.4324.182)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-NJ20V47\u0027, ip: \u0027192.168.1.45\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.182, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\KURSAT\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:53081}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 00e35483de371de826629c25ec4e3d4a\n*** Element info: {Using\u003dxpath, value\u003d//span[normalize-space()\u003d\u0027Sign in\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy14.click(Unknown Source)\r\n\tat stepdefinitions.UserInfo_StepDef.user_clicks_main_page_sign_in_button(UserInfo_StepDef.java:40)\r\n\tat ✽.User clicks main page sign in button(file:///C:/Users/KURSAT/IdeaProjects/gmibank/src/test/resources%E2%80%A8/features/US06_TC001.feature:24)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User enters username \"team35GmiBankProject\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_enters_username(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters password \"team35GmiBankProject\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_enters_password(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clicks_sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks profile image",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clicks_profile_image()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks User Info",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clicks_User_Info()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User change language",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_change_language()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks save button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clicks_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verifies settings are changing",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_verifies_settings_are_changing()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "User should be changing all data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC004-TC007"
    },
    {
      "name": "@FRY"
    }
  ]
});
formatter.step({
  "name": "User goes to \"url\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks people image",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks main page sign in button",
  "keyword": "And "
});
formatter.step({
  "name": "User enters username \"\u003cUsername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks sign in button",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks profile image",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks User Info",
  "keyword": "And "
});
formatter.step({
  "name": "User change firstname",
  "keyword": "And "
});
formatter.step({
  "name": "User clear firstname",
  "keyword": "And "
});
formatter.step({
  "name": "User change lastname",
  "keyword": "And "
});
formatter.step({
  "name": "User clear lastname",
  "keyword": "And "
});
formatter.step({
  "name": "User change email",
  "keyword": "And "
});
formatter.step({
  "name": "User clear first extension",
  "keyword": "And "
});
formatter.step({
  "name": "User clear  second extension",
  "keyword": "And "
});
formatter.step({
  "name": "User change language",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks save button",
  "keyword": "And "
});
formatter.step({
  "name": "User change firstname",
  "keyword": "And "
});
formatter.step({
  "name": "User clear firstname",
  "keyword": "And "
});
formatter.step({
  "name": "User change lastname",
  "keyword": "And "
});
formatter.step({
  "name": "User clear lastname",
  "keyword": "And "
});
formatter.step({
  "name": "User change email",
  "keyword": "And "
});
formatter.step({
  "name": "User clear first extension",
  "keyword": "And "
});
formatter.step({
  "name": "User clear  second extension",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "team35GmiBankProject",
        "team35GmiBankProject"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should be changing all data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC001"
    },
    {
      "name": "@FRY"
    },
    {
      "name": "@TC004-TC007"
    },
    {
      "name": "@FRY"
    }
  ]
});
formatter.step({
  "name": "User goes to \"url\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_goes_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks people image",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clicks_people_image()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks main page sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clicks_main_page_sign_in_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d//span[normalize-space()\u003d\u0027Sign in\u0027]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-NJ20V47\u0027, ip: \u0027192.168.1.45\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy14.click(Unknown Source)\r\n\tat stepdefinitions.UserInfo_StepDef.user_clicks_main_page_sign_in_button(UserInfo_StepDef.java:40)\r\n\tat ✽.User clicks main page sign in button(file:///C:/Users/KURSAT/IdeaProjects/gmibank/src/test/resources%E2%80%A8/features/US06_TC001.feature:43)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User enters username \"team35GmiBankProject\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_enters_username(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters password \"team35GmiBankProject\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_enters_password(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clicks_sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks profile image",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clicks_profile_image()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks User Info",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clicks_User_Info()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User change firstname",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_change_firstname()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clear firstname",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clear_firstname()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User change lastname",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_change_lastname()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clear lastname",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clear_lastname()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User change email",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_change_email()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clear first extension",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clear_first_extension()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clear  second extension",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clear_second_extension()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User change language",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_change_language()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks save button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clicks_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User change firstname",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_change_firstname()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clear firstname",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clear_firstname()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User change lastname",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_change_lastname()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clear lastname",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clear_lastname()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User change email",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_change_email()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clear first extension",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clear_first_extension()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clear  second extension",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clear_second_extension()"
});
formatter.result({
  "status": "skipped"
});
});