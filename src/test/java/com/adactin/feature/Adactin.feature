Feature: Hotel Booking in Adactin Application

@Test1
Scenario:  user Login In the Web Application
Given user Launch The Adactin Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button And It Navigates To Search Hotel Page

@Test2
Scenario: user Select Hotel Name in Search Hotel Page.
When user Select Location in Location Field
And user Select Hotel in Hotels Field
And user Select Room Type in Room Type Field
And user Select Number Of Rooms in 	Number of Rooms Field
And user Select Check In Date in Check In Date Field
And user Select Check Out Date in Check Out Date Field
And user Select Adults per Room in Adults per Room Field
And user Select Children per Room in Children per Room Field
Then user Click The Search Button And It Navigate To Select Hotel Page

@Test3
Scenario: user Confirm Hotel Name in Select Hotel Page.
When user Click The Select Button
Then User Click The Continue Button and It Navigate to Book A Hotel Page

@Test4
Scenario: user Book A Hotel in Book A Hotel Page
When user Enter The First Name in First Name Field
And user Enter The Last Name in Last Name Field
And user Enter The Address in Billing Address Field
And user Enter The Credit Card Number in Credit Card No. Field
And user Enter The Credit Card Type in Credit Card Type Field
And user Enter The Credit Card Expiry Date in Expiry Date Field
And user Enter The Credit Card CVV Number in CVV Number Field
Then user Click Book Now Button and It Navigate to Book Hotel Page

@Test5
Scenario: Logout the Application
Then user Click The Logout Button and It Navigates to Logout page

