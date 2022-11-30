package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	public static WebDriver driver= RunnerClass.driver;
	
	
	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
		
		driver.get("https://adactinhotelapp.com/");
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Padma1357");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Qaws!1234567");
	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		driver.findElement(By.name("login")).click();
	}

	@When("^user Select Location in Location Field$")
	public void user_Select_Location_in_Location_Field() throws Throwable {
		WebElement Location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(Location);
		s.selectByVisibleText("Paris");
	}

	@When("^user Select Hotel in Hotels Field$")
	public void user_Select_Hotel_in_Hotels_Field() throws Throwable {
		WebElement Hotels = driver.findElement(By.name("hotels"));
		Select e = new Select(Hotels);
		e.selectByIndex(2);
	}

	@When("^user Select Room Type in Room Type Field$")
	public void user_Select_Room_Type_in_Room_Type_Field() throws Throwable {
		WebElement RoomType = driver.findElement(By.name("room_type"));
		Select l = new Select(RoomType);
		l.selectByIndex(3);
	}

	@When("^user Select Number Of Rooms in 	Number of Rooms Field$")
	public void user_Select_Number_Of_Rooms_in_Number_of_Rooms_Field() throws Throwable {
		WebElement Nrooms = driver.findElement(By.name("room_nos"));
		Select c = new Select(Nrooms);
		c.selectByIndex(2);
	}

	@When("^user Select Check In Date in Check In Date Field$")
	public void user_Select_Check_In_Date_in_Check_In_Date_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='datepick_in']")).sendKeys("26/11/2022");
	}

	@When("^user Select Check Out Date in Check Out Date Field$")
	public void user_Select_Check_Out_Date_in_Check_Out_Date_Field() throws Throwable {
		WebElement Checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		Thread.sleep(3000); 
		Checkout.sendKeys("27/11/2022");
	}

	@When("^user Select Adults per Room in Adults per Room Field$")
	public void user_Select_Adults_per_Room_in_Adults_per_Room_Field() throws Throwable {
		WebElement adult = driver.findElement(By.name("adult_room"));
		Select f = new Select(adult);
		f.selectByIndex(2);
	}

	@When("^user Select Children per Room in Children per Room Field$")
	public void user_Select_Children_per_Room_in_Children_per_Room_Field() throws Throwable {
		WebElement child = driver.findElement(By.name("child_room"));
		Select g = new Select(child);
		g.selectByIndex(0);
	}

	@Then("^user Click The Search Button And It Navigate To Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigate_To_Select_Hotel_Page() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	}

	@When("^user Click The Select Button$")
	public void user_Click_The_Select_Button() throws Throwable {
		driver.findElement(By.name("radiobutton_0")).click();
	}

	@Then("^User Click The Continue Button and It Navigate to Book A Hotel Page$")
	public void user_Click_The_Continue_Button_and_It_Navigate_to_Book_A_Hotel_Page() throws Throwable {
		driver.findElement(By.name("continue")).click();
	}

	@When("^user Enter The First Name in First Name Field$")
	public void user_Enter_The_First_Name_in_First_Name_Field() throws Throwable {
		driver.findElement(By.name("first_name")).sendKeys("Padmavathi");
	}

	@When("^user Enter The Last Name in Last Name Field$")
	public void user_Enter_The_Last_Name_in_Last_Name_Field() throws Throwable {
		driver.findElement(By.name("last_name")).sendKeys("R");
	}

	@When("^user Enter The Address in Billing Address Field$")
	public void user_Enter_The_Address_in_Billing_Address_Field() throws Throwable {
		driver.findElement(By.name("address")).sendKeys("Chennai");
	}

	@When("^user Enter The Credit Card Number in Credit Card No\\. Field$")
	public void user_Enter_The_Credit_Card_Number_in_Credit_Card_No_Field() throws Throwable {
		driver.findElement(By.name("cc_num")).sendKeys("9812345679090076");
	}

	@When("^user Enter The Credit Card Type in Credit Card Type Field$")
	public void user_Enter_The_Credit_Card_Type_in_Credit_Card_Type_Field() throws Throwable {
		WebElement card = driver.findElement(By.name("cc_type"));
		Select ca = new Select(card);
		ca.selectByIndex(2);
	}

	@When("^user Enter The Credit Card Expiry Date in Expiry Date Field$")
	public void user_Enter_The_Credit_Card_Expiry_Date_in_Expiry_Date_Field() throws Throwable {
		WebElement date = driver.findElement(By.name("cc_exp_month"));
		Select da = new Select(date);
		da.selectByVisibleText("December");
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.name("cc_exp_year"));
		Select yr = new Select(year);
		yr.selectByVisibleText("2022");

	}

	@When("^user Enter The Credit Card CVV Number in CVV Number Field$")
	public void user_Enter_The_Credit_Card_CVV_Number_in_CVV_Number_Field() throws Throwable {
		driver.findElement(By.name("cc_cvv")).sendKeys("123");
		Thread.sleep(3000);
	}

	@Then("^user Click Book Now Button and It Navigate to Book Hotel Page$")
	public void user_Click_Book_Now_Button_and_It_Navigate_to_Book_Hotel_Page() throws Throwable {
		driver.findElement(By.name("book_now")).click();
		Thread.sleep(6000);


	}

	@Then("^user Click The Logout Button and It Navigates to Logout page$")
	public void user_Click_The_Logout_Button_and_It_Navigates_to_Logout_page() throws Throwable {
		driver.findElement(By.name("logout")).click();
	}

	
}
