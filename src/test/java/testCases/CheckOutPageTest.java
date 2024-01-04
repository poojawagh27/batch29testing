package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Cart_Page;
import pages.LoginPage;
import pages.inventry_page;
import utility.Screenshot;

public class CheckOutPageTest  extends TestBase
{
	LoginPage login;
	inventry_page invent;
	Cart_Page cart;
	CheackOutpage1 check1;
	
	 @BeforeMethod
    public void setup() throws IOException, InterruptedException
    {
   	 initialization();
   	 login=new LoginPage();
   	 invent= new inventry_page();
   	 cart=new Cart_Page();
   	 check1=new CheackOutpage1();
   	 login.loginToApplication();
   	 invent.add6product();
   	 invent.clickcartIcon();
   	 cart.ClickOnCheckoutBtn();
   
   	 }
	 @Test
	 public void verifyURLTest()
	 {
		 String expURL="https://www.saucedemo.com/checkout-step-one.html";
		 String actURL=check1.verifyURL();
		 Assert.assertEquals(expURL,actURL);
	 }
	 @Test
	 public void inputInfoTest()
	 {
		 String expURL="https://www.saucedemo.com/checkout-step-two.html";
		 String actURL=check1.inputInfo();
		 Assert.assertEquals(expURL,actURL);
		 
	 }
	 
	 @Test
	 public void verifyLableTest()
	 {
		String expText="Checkout: Your Information";
		String actText=check1.verifyLable();
		Assert.assertEquals(expText, actText);
	 }
	 @Test
	 public void cancleBtnTest()
	 {
		 String expURL="https://www.saucedemo.com/cart.html";
		 String actURL=check1.cancleBtn();
		 Assert.assertEquals(expURL,actURL);
	 }
	 @AfterMethod
	    public void closeBrowser()
	    
	   	 {
		 	driver.close();
	   	 }
	   	 
	    }
	   
    

