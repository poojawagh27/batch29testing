package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
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
import utility.ReadData;
import utility.Screenshot;

public class Cart_Page_Test  extends TestBase
{
	LoginPage login;
	inventry_page invent;
	Cart_Page cart;
	 @BeforeMethod (alwaysRun = true)
    public void setup() throws IOException, InterruptedException
    {
   	 initialization();
   	 login=new LoginPage();
   	 invent= new inventry_page();
   	 cart=new Cart_Page();
   	 login.loginToApplication();
   	 invent.add6product();
   	 invent.clickcartIcon();
   	 }
    @Test (enabled = true,priority = 1,groups = {"Sanity"})
    public void verifyCartpageurlTest() throws EncryptedDocumentException, IOException
    {
    	String expURL=ReadData.readExel(0,6);//https://www.saucedemo.com/cart.html(0,6)
    	String actURL=cart.verifyCartpageurl();
    	Assert.assertEquals(expURL,actURL);
    	Reporter.log ( "Current page URL of cart_page=" + actURL);
    }
    @Test  (enabled = true,priority = 2,groups = {"Retesting"})
    public void verifyCartPageLableTest() throws EncryptedDocumentException, IOException
    {
    	String expText=ReadData.readExel(0,7);//Your Cart(0,7)
    	String actText=cart.verifyCartPageLable();
    	Assert.assertEquals(expText, actText);
    	Reporter.log("Cart page lable= "+ actText);
    }
    @AfterMethod  (alwaysRun = true)
    public void closeBrowser(ITestResult it) throws IOException
    {
   	 if(it.FAILURE==it.getStatus())
   	 {
   		Screenshot.Screenshot(it.getName()); 
   	 }
   	 driver.close();
    }
   
}
