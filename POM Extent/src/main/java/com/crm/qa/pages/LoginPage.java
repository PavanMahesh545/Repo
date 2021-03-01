package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy (xpath="(//span[@class='label'])[3]")
	 WebElement clickAccount;
	@FindBy (xpath="//div[@class='links']//ul//li[@class=' last']//a")
	 WebElement clickLogin;
	@FindBy (xpath="//input[@type=\"email\"][@title=\"Email Address\"]")
 WebElement email;
	@FindBy (xpath="//input[@type=\"password\"]")
   WebElement password;
	@FindBy (xpath="//button[@type=\"submit\"][@title=\"Login\"]")
 WebElement login;
	@FindBy (xpath="//span[text()=\"Invalid login or password.\"]")
	 WebElement invalidMsg;
	@FindBy (xpath="//*[@id=\"top\"]/body/div/div[2]/div[3]/div/address")
	WebElement msg;
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	public void accountBy()
	{
		this.clickAccount.click();
	}
	
	public void loginBy() {
		this.clickLogin.click();
	}
		 public void enterEmail(String mail) {
		   this.email.sendKeys(mail);
		 }
		//Method to enter password
			 public void enterPassword(String pass) {
				 this.password.sendKeys(pass);
			 }
		
			 public void clicklogin() {
			   this.login.click();
			 }
			 
			 
			 
			 public String Message()
			 {
				 return this.msg.getText();
			 }

			 
			 public String errorMessage()
			 {
				 return this.invalidMsg.getText();
			 }





			public HomePage login(String property, String property2) {
				// TODO Auto-generated method stub
				return null;
			}

	
	
	
	
	
	
	
	
	
		    	
	}
	

