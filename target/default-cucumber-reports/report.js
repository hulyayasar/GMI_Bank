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
formatter.scenario({
  "name": ": User goes to the home page and navigates to the manage customer link",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@us_012"
    }
  ]
});
formatter.step({
  "name": "User goes to the home page and log in",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.us12_stepdefinitions.user_goes_to_the_home_page_and_log_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on My Operations field",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.us12_stepdefinitions.user_clicks_on_My_Operations_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Manage Customers field",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.us12_stepdefinitions.user_clicks_on_Manage_Customers_field()"
});
formatter.result({
  "status": "passed"
});
});