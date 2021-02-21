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
  "name": "Employee should see all the information related to the customers.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@us_012"
    },
    {
      "name": "@Tc1201"
    }
  ]
});
formatter.step({
  "name": "User checks the First Name",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_checks_the_First_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User checks the Last Name",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_checks_the_Last_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User checks the Middle Initial",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_checks_the_Middle_Initial()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User checks the Email",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_checks_the_Email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User checks the Mobile Phone Number",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_checks_the_Mobile_Phone_Number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User checks the Phone Number",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_checks_the_Phone_Number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User checks the Address",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_checks_the_Address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User checks the Create Date",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_checks_the_Create_Date()"
});
formatter.result({
  "status": "passed"
});
});