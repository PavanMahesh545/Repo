package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy (xpath="//div[@class='block-content']//ul//li[@class='current']//a//strong")
	 WebElement dashboard;
	@FindBy (xpath="//*[@id=\"top\"]/body/div/div[2]/div[3]/div/div[1]/div/strong/span")
	 WebElement checkMessage;
	@FindBy (xpath="//input[@id='search']")
	 WebElement searchBox;
	@FindBy (xpath="//*[@id=\"search_mini_form\"]/div[1]/button")
     WebElement clickButton;
	@FindBy (xpath="//*[@id='top']/body/div/div[2]/div[1]/div/p")
WebElement welcomemsg;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	

	
	public String clickdashboard() {
		this.dashboard.click();
		return welcomemsg.getText();
	}
	public String assertcheckBy()
	{
		return checkMessage.getText();
	}
	public void searchproducts(String search) {
		Actions act=new Actions(driver);
		act.moveToElement(searchBox).click().build().perform();
		
		this.searchBox.sendKeys(search);
	}
	//Method for search
	public SignUpPage clicksearch() {
		clickButton.click();
		   //driver.sendKeys("men pants");
		return null;
		 }
	
	
	
	
	
	

}
