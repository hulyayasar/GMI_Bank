$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources%E2%80%A8/features/register.feature");
formatter.feature({
  "name": "User can register on GMI Bank",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Register",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on registration page",
  "keyword": "Given "
});
formatter.step({
  "name": "user writes SSN number using \"\u003cSSN\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user writes firstname \"\u003cfirstname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user writes surname \"\u003clastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user writes address \"\u003caddress\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user writes mobilephone \"\u003cmobilephone\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user writes username \"\u003cusername\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user writes email \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "send data",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "SSN",
        "firstname",
        "lastname",
        "address",
        "mobilephone",
        "username",
        "email"
      ]
    },
    {
      "cells": [
        "123-45-6789",
        "Ayse",
        "Yilmaz",
        "123 Main Street Anycity FL 32104",
        "123-123-4444",
        "Thebestusername123",
        "xyz@gmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Register",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.step({
  "name": "user is on registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.RegisterStepDefinitions.user_is_on_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user writes SSN number using \"123-45-6789\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.RegisterStepDefinitions.user_writes_SSN_number_using(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user writes firstname \"Ayse\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.RegisterStepDefinitions.user_writes_firstname(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user writes surname \"Yilmaz\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.RegisterStepDefinitions.user_writes_surname(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user writes address \"123 Main Street Anycity FL 32104\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.RegisterStepDefinitions.user_writes_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user writes mobilephone \"123-123-4444\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.RegisterStepDefinitions.user_writes_mobilephone(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user writes username \"Thebestusername123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.RegisterStepDefinitions.user_writes_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user writes email \"xyz@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.RegisterStepDefinitions.user_writes_email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});