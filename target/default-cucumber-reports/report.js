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
  "name": "TC1202_Employee should see all the information through \"View\" button and can edit from View Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@us_012"
    },
    {
      "name": "@Tc1202"
    }
  ]
});
formatter.step({
  "name": "User clicks on View button on a customer.",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_clicks_on_View_button_on_a_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Back button.",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_clicks_on_Back_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on View button on a customer.",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_clicks_on_View_button_on_a_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Edit button.",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_clicks_on_Edit_button()"
});
formatter.result({
  "status": "passed"
});
});