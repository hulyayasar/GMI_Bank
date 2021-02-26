$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources%E2%80%A8/features/US06_TC001.feature");
formatter.feature({
  "name": "US006",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TC001"
    }
  ]
});
formatter.scenario({
  "name": "User should be changing all data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TC001"
    },
    {
      "name": "@TCEmail"
    }
  ]
});
formatter.step({
  "name": "user navigate the url",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.LoginPage.user_navigate_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Sing in button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.LoginPage.click_Sing_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.LoginPage.enter_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click for  Sing in button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.LoginPage.click_for_Sing_in_button()"
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
  "name": "User change firstname",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_change_firstname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clear firstname",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clear_firstname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User change lastname",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_change_lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clear lastname",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clear_lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User change email",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_change_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clear first extension",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clear_first_extension()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clear  second extension",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clear_second_extension()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User change language",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_change_language()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks save button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clicks_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User change firstname",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_change_firstname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clear firstname",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clear_firstname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User change lastname",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_change_lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clear lastname",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clear_lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User change email",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_change_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clear first extension",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.UserInfo_StepDef.user_clear_first_extension()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: The following asserts failed:\n\texpected [true] but found [false]\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:47)\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:31)\r\n\tat stepdefinitions.UserInfo_StepDef.user_clear_first_extension(UserInfo_StepDef.java:291)\r\n\tat ✽.User clear first extension(file:///C:/Users/KURSAT/IdeaProjects/gmibank/src/test/resources%E2%80%A8/features/US06_TC001.feature:52)\r\n",
  "status": "failed"
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