package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Cart_Page;
import pages.LoginPage;
import pages.inventry_page;

public class Checkoutpagetest2 extends TestBase
{
	LoginPage login;
	inventry_page invent;
	Cart_Page cart;
	CheackOutpage1 check1;
	CheckOutPage2 check2;
	
	 @BeforeMethod
    public void setup() throws IOException, InterruptedException
    {
   	 initialization();
   	 login=new LoginPage();
   	 invent= new inventry_page();
   	 cart=new Cart_Page();
   	 check1=new CheackOutpage1();
   	 check2=new CheckOutPage2();
   	 login.loginToApplication();
   	 invent.add6product();
   	 invent.clickcartIcon();
   	 cart.ClickOnCheckoutBtn();
   	 check1.inputInfo();
   	}
	 @Test
	 public void verifyURLTest()
	 {
		 String expURL="https://www.saucedemo.com/checkout-step-two.html";
		 String actURL=check2.verifyURL();
		 Assert.assertEquals(expURL,actURL);
	 }
	 @Test
	 public void verifycancleBtnTest()
	 {
		 String expURL="https://www.saucedemo.com/inventory.html";
		 String actURL=check2.verifycancleBtn();
		 Assert.assertEquals(expURL,actURL);
	 }
	 @Test
	 public void verifyfinishBtnTest()
	 {
		 String expURL="https://www.saucedemo.com/checkout-complete.html";
		 String actURL=check2.verifyfinishBtn();
		 Assert.assertEquals(expURL,actURL);
	 }
	 @Test
	 public void verifyApplogoTest()
	 {
		 String expText="Swag Labs";
		 String actText=check2.verifyApplogoTest();
		 Assert.assertEquals(expText,actText);
	 }
	 @Test
	 public void verifycheckoutoverviewTest()
	 {
		 String expLable="Checkout: Overview";
		 String actLable=check2.verifycheckoutoverview();
		 Assert.assertEquals(expLable,actLable);
	 }
	 @Test
	 public void verifypaymentinformationTextTest()
	 {
		 String exptext="Payment Information";
		 String actText=check2.verifypaymentinformationText();
		 Assert.assertEquals(exptext,actText);
	 }
	 @Test
	 public void verifyshippinginformationTextTest()
	 {
		 String exptext="Shipping Information";
		 String acttext=check2.verifyshippinginformationText();
		 Assert.assertEquals(exptext,acttext);
	 }
	 @Test
	 public void verifyfreedeleveryTest()
	 {
		 String exptext="Free Pony Express Delivery!";
		 String acttext=check2.verifyfreedelevery();
		 Assert.assertEquals(exptext, acttext);
	 }
	 @Test
	 public void verifysauceCardTest()
	 {
		String exptext="SauceCard #31337";
		String acttext=check2.verifysauceCard();
		Assert.assertEquals(exptext,acttext);
	 }
	 @Test
	 public void verifypricetotaltextTest()
	 {
		 String exptext="Price Total";
		 String acttext=check2.verifypricetotaltext();
		 Assert.assertEquals(exptext,acttext);
	 }
		 
	 @AfterMethod
	    public void closeBrowser()
	    
	   	 {
		 	driver.close();
	   	 }
	   	 
	
}
