$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources%E2%80%A8/features/us_005.feature");
formatter.feature({
  "name": "Login page should not be accessible with invalid credentials",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@us_005"
    }
  ]
});
formatter.scenarioOutline({
  "name": "TC_0001_User cannot login with invalid username validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC_0001"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.step({
  "name": "user enters the username \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enters the password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "invalid username and valid password",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "hey",
        "team35GmiBankProject"
      ]
    },
    {
      "cells": [
        "hello",
        "thebestemployee"
      ]
    },
    {
      "cells": [
        "hi",
        "theUser"
      ]
    },
    {
      "cells": [
        "name",
        "theCustomer"
      ]
    }
  ]
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0001_User cannot login with invalid username validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0001"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"hey\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"team35GmiBankProject\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0001_User cannot login with invalid username validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0001"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"hello\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"thebestemployee\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0001_User cannot login with invalid username validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0001"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"hi\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"theUser\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0001_User cannot login with invalid username validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0001"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"name\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"theCustomer\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC_0002_User cannot login with invalid username validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC_0002"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.step({
  "name": "user enters the password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.step({
  "name": "verify the error message empty contains \"Username\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "invalid username and valid password",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "password"
      ]
    },
    {
      "cells": [
        "team35GmiBankProject"
      ]
    },
    {
      "cells": [
        "thebestemployee"
      ]
    },
    {
      "cells": [
        "theUser"
      ]
    },
    {
      "cells": [
        "theCustomer"
      ]
    }
  ]
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0002_User cannot login with invalid username validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0002"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"team35GmiBankProject\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message empty contains \"Username\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verifyTheErrorMessageEmptyContains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0002_User cannot login with invalid username validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0002"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"thebestemployee\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message empty contains \"Username\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verifyTheErrorMessageEmptyContains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0002_User cannot login with invalid username validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0002"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"theUser\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message empty contains \"Username\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verifyTheErrorMessageEmptyContains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0002_User cannot login with invalid username validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0002"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"theCustomer\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message empty contains \"Username\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verifyTheErrorMessageEmptyContains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC_0003_User cannot login with invalid password validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC_0003"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.step({
  "name": "user enters the username \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enters the password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "invalid username and valid password",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "team35GmiBankProject",
        "hey"
      ]
    },
    {
      "cells": [
        "thebestemployee",
        "hello"
      ]
    },
    {
      "cells": [
        "theUser",
        "hi"
      ]
    },
    {
      "cells": [
        "theCustomer",
        "name"
      ]
    }
  ]
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0003_User cannot login with invalid password validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0003"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"team35GmiBankProject\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"hey\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0003_User cannot login with invalid password validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0003"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"thebestemployee\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"hello\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0003_User cannot login with invalid password validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0003"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"theUser\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"hi\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0003_User cannot login with invalid password validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0003"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"theCustomer\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"name\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC_0004_User cannot login with invalid password validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC_0004"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.step({
  "name": "user enters the username \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enters the password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.step({
  "name": "verify the error message empty contains \"Password\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "invalid username and valid password",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "team35GmiBankProject",
        ""
      ]
    },
    {
      "cells": [
        "thebestemployee",
        ""
      ]
    },
    {
      "cells": [
        "theUser",
        ""
      ]
    },
    {
      "cells": [
        "theCustomer",
        ""
      ]
    }
  ]
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0004_User cannot login with invalid password validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0004"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"team35GmiBankProject\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message empty contains \"Password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verifyTheErrorMessageEmptyContains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0004_User cannot login with invalid password validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0004"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"thebestemployee\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message empty contains \"Password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verifyTheErrorMessageEmptyContains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0004_User cannot login with invalid password validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0004"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"theUser\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message empty contains \"Password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verifyTheErrorMessageEmptyContains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0004_User cannot login with invalid password validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0004"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"theCustomer\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message empty contains \"Password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verifyTheErrorMessageEmptyContains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC_0005_User cannot login with invalid username and password validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC_0005"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.step({
  "name": "user enters the username \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enters the password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "invalid username and valid password",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "hey",
        "hey"
      ]
    },
    {
      "cells": [
        "hello",
        "hello"
      ]
    },
    {
      "cells": [
        "hi",
        "hi"
      ]
    },
    {
      "cells": [
        "name",
        "name"
      ]
    }
  ]
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0005_User cannot login with invalid username and password validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0005"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"hey\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"hey\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0005_User cannot login with invalid username and password validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0005"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"hello\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"hello\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0005_User cannot login with invalid username and password validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0005"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"hi\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"hi\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0005_User cannot login with invalid username and password validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0005"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"name\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"name\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC_0006_User cannot login with invalid username and password validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC_0006"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.step({
  "name": "user enters the username \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enters the password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.step({
  "name": "verify the error message empty contains \"Username\"",
  "keyword": "Then "
});
formatter.step({
  "name": "verify the error message empty contains second \"Password\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "invalid username and valid password",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "",
        ""
      ]
    }
  ]
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0006_User cannot login with invalid username and password validating the error message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0006"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message empty contains \"Username\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verifyTheErrorMessageEmptyContains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message empty contains second \"Password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verifyTheErrorMessageEmptyContainsSecond(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC_0007_User with invalid credentials should be given an option to reset their password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC_0007"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.step({
  "name": "user enters the username \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enters the password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on the reset option",
  "keyword": "And "
});
formatter.step({
  "name": "verify the resetPassword title is \"Reset your password\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "invalid username and valid password",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "hey",
        "hey"
      ]
    }
  ]
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0007_User with invalid credentials should be given an option to reset their password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0007"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"hey\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"hey\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the reset option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_reset_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the resetPassword title is \"Reset your password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_resetPassword_title_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC_0008_User with invalid credentials should be given an option to reset their password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC_0008"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.step({
  "name": "user enters the username \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enters the password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on the register a new account option",
  "keyword": "And "
});
formatter.step({
  "name": "verify the RegisterANewAccount title is \"Registration\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "invalid username and valid password",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "hey",
        "hey"
      ]
    }
  ]
});
formatter.background({
  "name": "User is on the main page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0008_User with invalid credentials should be given an option to reset their password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_005"
    },
    {
      "name": "@TC_0008"
    }
  ]
});
formatter.step({
  "name": "click on person sign",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_person_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"hey\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"hey\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.user_enters_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message contains \"Failed\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_error_message_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the register a new account option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.click_on_the_register_a_new_account_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the RegisterANewAccount title is \"Registration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US05_StepDefinitions.verify_the_RegisterANewAccount_title_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});