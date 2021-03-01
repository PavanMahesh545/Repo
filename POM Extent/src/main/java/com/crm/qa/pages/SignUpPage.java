package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SignUpPage extends TestBase{
	
	
	@FindBy (xpath="(//span[@class='label'])[3]")
	 WebElement clickAccount;
	@FindBy (xpath="//div[@id='header-account']//div//ul//li//a[@title='Register']")
	 WebElement clickRegister;
	@FindBy (xpath="//input[@id=\"firstname\"]")
	 WebElement firstName;
	@FindBy (xpath="//input[@id=\"middlename\"]")
	 WebElement middleName;
	@FindBy (xpath="//input[@id=\"lastname\"]")
	 WebElement lastName;
	@FindBy (xpath="//input[@id=\"email_address\"]")
	 WebElement email;
	@FindBy (xpath="//input[@id=\"password\"]")
	 WebElement password;
	@FindBy (xpath="//input[@id=\"confirmation\"]")
	 WebElement confirmPass;
	@FindBy (xpath="//*[@id=\"form-validate\"]/div[2]/button/span/span")
	 WebElement clickOnRegisterButton;


	public SignUpPage()
	{
	
		PageFactory.initElements(driver, this);
	}

	
	public void clickaccountBy()
	{
		this.clickAccount.click();
	}
	public void clickregisterBy()
	{
		this.clickRegister.click();
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName.sendKeys(firstName);
	}
	
	public void setMiddleName(String mn)
	{
		this.middleName.sendKeys(mn);
	}
	
	public void setlastName(String lastName)
	{
		this.lastName.sendKeys(lastName);
	}
	public void setEmail(String email)
	{
		this.email.sendKeys(email);
	}
	public void setPassword(String password)
	{
		this.password.sendKeys(password);
	}
	public void setConfirmPassword(String confirm)
	{
		this.confirmPass.sendKeys(confirm);
	}
	public void clickOnRegisterButton() {
		clickOnRegisterButton.click();
	}


	public void createNewaccount(String firstname, String midlename, String lastName, String email,String password,String confirm) {
		
		
		
		// TODO Auto-generated method stub
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
