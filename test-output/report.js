$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Muthukumar/eclipse-workspace/SampleBDD/src/main/java/com/feature/scenario1.feature");
formatter.feature({
  "line": 2,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 14,
  "name": "Validating Home page",
  "description": "",
  "id": "title-of-your-feature;validating-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@MakeMyTrip"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user lanches the Url of amkemy trip",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User selects the round trip radio button",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user selects from and To locations from the drop down",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdef.user_lanches_the_Url_of_amkemy_trip()"
});
formatter.result({
  "duration": 12880399599,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdef.user_selects_the_round_trip_radio_button()"
});
formatter.result({
  "duration": 350331600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdef.user_selects_from_and_To_locations_from_the_drop_down()"
});
formatter.result({
  "duration": 5178385699,
  "status": "passed"
});
});