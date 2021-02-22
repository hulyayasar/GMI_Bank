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
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003ca class\u003d\"btn btn-info btn-sm\" href\u003d\"/tp-customer/33892\"\u003e...\u003c/a\u003e is not clickable at point (1301, 27). Other element would receive the click: \u003csvg aria-hidden\u003d\"true\" focusable\u003d\"false\" data-prefix\u003d\"fas\" data-icon\u003d\"user\" class\u003d\"svg-inline--fa fa-user fa-w-14 \" role\u003d\"img\" xmlns\u003d\"http://www.w3.org/2000/svg\" viewBox\u003d\"0 0 448 512\"\u003e...\u003c/svg\u003e\n  (Session info: chrome\u003d88.0.4324.182)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-J2R02Q4\u0027, ip: \u002710.146.23.238\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.6\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.182, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\TESTIN~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:62846}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 6344c384b43d43ad50385a5a36bf4bbd\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat stepdefinitions.US12_StepDefinitions.user_clicks_on_View_button_on_a_customer(US12_StepDefinitions.java:136)\r\n\tat ✽.User clicks on View button on a customer.(file:///C:/Users/testinium/Desktop/Eclipse/Maven01/gmibank/src/test/resources%E2%80%A8/features/us_012.feature:12)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User clicks on Edit button.",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US12_StepDefinitions.user_clicks_on_Edit_button()"
});
formatter.result({
  "status": "skipped"
});
});