package com.crm.qa.testcases;



	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;


	import com.crm.qa.base.TestBase;
	
	import com.crm.qa.pages.HomePage;
	import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;
import com.crm.qa.util.TestUtil;

	
		public class SignUpTest extends TestBase {

		LoginPage loginPage;
		HomePage homePage;
		TestUtil testUtil;
		SignUpPage sPage;
		
		String sheetName = "contacts";
		
		   
		public SignUpTest(){
				super();
				
		}
		
		
		@BeforeMethod
		public void setUp() throws InterruptedException {
			
			initialization();
			testUtil = new TestUtil();
			sPage = new SignUpPage();
			loginPage = new LoginPage();
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

			testUtil.switchToFrame();
			sPage = homePage.clicksearch();
		}
		

		
		@DataProvider
		public Object[][] getCRMTestData(){
			Object data[][] = TestUtil.getTestData(sheetName);
			return data;
		}
		
		
		@Test(priority=1, dataProvider="getCRMTestData")
		public void validateCreateNewContact(String firstname, String midlename, String lastName, String email,String password,String confirm) {
			homePage.clickdashboard();
		
			sPage.createNewaccount(firstname,midlename,lastName,email,password,confirm);
			
		}
		
		

		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

