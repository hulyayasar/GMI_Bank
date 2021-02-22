$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources%E2%80%A8/features/us_012.feature");
formatter.feature({
  "name": "An Employee can manage Customer",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@us_012"
    }
  ]
});
formatter.background({
  "name": "User goes to the home page and navigates to the manage customer link",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User goes to the home page and log in",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_goes_to_the_home_page_and_log_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on My Operations field",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_clicks_on_My_Operations_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Manage Customers field",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_clicks_on_Manage_Customers_field()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC1203_Employee should be able to edit customer info from Edit Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@us_012"
    },
    {
      "name": "@Tc1203"
    }
  ]
});
formatter.step({
  "name": "User clicks on Edit button on a customer",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_clicks_on_Edit_button_on_a_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User changes the FirstName",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_changes_the_FirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User changes the LastName",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_changes_the_LastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User changes the Email",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_changes_the_Email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User changes the MobilePhoneNumber",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_changes_the_MobilePhoneNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User changes the ZipCode",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_changes_the_ZipCode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User changes the Address",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_changes_the_Address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_clicks_on_Save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifies the success message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.verifies_the_success_message()"
});
formatter.result({
  "status": "passed"
});
});