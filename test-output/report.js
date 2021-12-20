$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Log in Funtionality",
  "description": "",
  "id": "log-in-funtionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Sign in  Functionality",
  "description": "",
  "id": "log-in-funtionality;sign-in--functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user should open T-Mobile login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter user name and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on SetUp Btn",
  "keyword": "And "
});
formatter.match({
  "location": "stepDef.user_should_open_tmobile_login_page()"
});
formatter.result({
  "duration": 12363203100,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_enter_user_name_and_password()"
});
formatter.result({
  "duration": 222054600,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_click_on_login_button()"
});
formatter.result({
  "duration": 50164730300,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_click_on_SetUp_button()"
});
formatter.result({
  "duration": 18962277900,
  "status": "passed"
});
});