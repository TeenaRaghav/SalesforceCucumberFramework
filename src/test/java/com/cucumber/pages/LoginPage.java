package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;


public class LoginPage extends BasePage{
	static WebDriver driver;
	public LoginPage() {
		super(driver=BaseTest.getDriver("Chrome"));
		addObject("Username",By.xpath("//input[@id='username']"));
		addObject("Password",By.xpath("//input[@id='password']"));
		addObject("Login",By.xpath("//input[@id='Login']"));
		addObject("RememberMe",By.xpath("//input[@id='rememberUn']"));
		addObject("Error" , By.xpath("//div[@id='error']"));
		addObject("Forgot Your Password?",By.xpath("//a[@id='forgot_password_link']"));
		addObject("Username2",By.xpath("//input[@id = 'un']"));
		addObject("Continue",By.xpath("//input[@id = 'continue']"));
		addObject("ReturnToLogin",By.xpath("//a[normalize-space()='Return to Login']"));
		

	}
}
