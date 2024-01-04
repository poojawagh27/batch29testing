package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import pages.LoginPage;
import pages.inventry_page;

public class inventry_page_Test extends TestBase
{
	LoginPage login;
	inventry_page invent;
    @BeforeMethod
    public void setup() throws IOException, InterruptedException
    {
    	 initialization();
   	 login=new LoginPage();
   	 invent= new inventry_page();
   	 login.loginToApplication();
    
    }
    @Test
    public void verifyproductlable()
    {
    	String expLable="Products";
    	String actLable=invent.verifyproductlable();
    	Assert.assertEquals(expLable,actLable);
    }
    @Test
    public void verifyTwitterLogo()
    {
    	boolean result=invent.verifyTwitterLogo();
    	{
    		boolean result1 = invent.verifyTwitterLogo();
    	Assert.assertEquals(result1,true);
    	Reporter.log("Visibility of TwiteerLogo"+ result1);
    	}
    }
    @Test
    public void add6productTest()
    {
    	String expcount="6";
    	String actcount=invent.add6product();
    	Assert.assertEquals(expcount,actcount);
    	} 
    @AfterMethod
    public void closeBrowser()
    {
    driver.close();
    }
}