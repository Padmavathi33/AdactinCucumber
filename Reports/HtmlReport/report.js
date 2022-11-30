$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking in Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "user Login In the Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Username In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 3593166100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Username_In_Username_Field()"
});
formatter.result({
  "duration": 190523400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Password_In_Password_Field()"
});
formatter.result({
  "duration": 157158500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1199749300,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "user Select Hotel Name in Search Hotel Page.",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-select-hotel-name-in-search-hotel-page.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user Select Location in Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user Select Hotel in Hotels Field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Select Room Type in Room Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user Select Number Of Rooms in \tNumber of Rooms Field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Select Check In Date in Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Select Check Out Date in Check Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Select Adults per Room in Adults per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Select Children per Room in Children per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Click The Search Button And It Navigate To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_Location_in_Location_Field()"
});
formatter.result({
  "duration": 199808000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Hotel_in_Hotels_Field()"
});
formatter.result({
  "duration": 275298300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Room_Type_in_Room_Type_Field()"
});
formatter.result({
  "duration": 225325100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Number_Of_Rooms_in_Number_of_Rooms_Field()"
});
formatter.result({
  "duration": 202282700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Check_In_Date_in_Check_In_Date_Field()"
});
formatter.result({
  "duration": 184999800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Check_Out_Date_in_Check_Out_Date_Field()"
});
formatter.result({
  "duration": 3178260000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Adults_per_Room_in_Adults_per_Room_Field()"
});
formatter.result({
  "duration": 242681600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Children_per_Room_in_Children_per_Room_Field()"
});
formatter.result({
  "duration": 133794500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Search_Button_And_It_Navigate_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 888116600,
  "status": "passed"
});
});