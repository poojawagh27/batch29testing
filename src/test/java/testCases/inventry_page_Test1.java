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
import pages.LoginPage;
import pages.inventry_page;
import utility.ReadData;
import utility.Screenshot;

public class inventry_page_Test1 extends TestBase
{
	LoginPage login;
	inventry_page invent;
	
    @BeforeMethod (alwaysRun = true)
    public void setup() throws IOException, InterruptedException
    {
   	 initialization();
   	 login=new LoginPage();
   	 invent= new inventry_page();
   	 login.loginToApplication();
   	 }
    @Test  (enabled = true,priority = 2, groups = {"Retesting"})
    public void verifyproductlable() throws EncryptedDocumentException, IOException
    {
      String expLable=ReadData.readExel(0,3);//Products(0,3)
      String actLable=invent.verifyproductlable();
      Assert.assertEquals(expLable,actLable);
    }
    @Test  (enabled = true,priority = 3,groups = {"Sanity"})
    public void verifyTwitterLogo()
    {
    	boolean result=invent.verifyTwitterLogo();
    	Assert.assertEquals(result,true);
    	Reporter.log( "Visibility of TwitterLogo"+ result);
 
    }
    @Test  (enabled = true,priority = 1,groups = {"Sanity","Regreession"})
    public void add6product() throws EncryptedDocumentException, IOException
    {
    	String expCount=ReadData.readExel(0,4);//(0,4)
    	String actCount=invent.add6product();
    	Assert.assertEquals(expCount,actCount);
 }
    @Test  (enabled = true,priority = 4,groups = {"Sanity","Regreession"})
    public void remove2productTest() throws EncryptedDocumentException, IOException
    {
    	String expCount=ReadData.readExel(0,5);//(0,5)
    	String actCount=invent.remove2product();
    	Assert.assertEquals(expCount,actCount);
    	Reporter.log("Number of product aftre removing = "+ actCount);
    }
    @AfterMethod (alwaysRun = true)
    public void closeBrowser(ITestResult it) throws IOException
    {
   	 if(it.FAILURE==it.getStatus())
   	 {
   		Screenshot.Screenshot(it.getName()); 
   	 }
   	 driver.close();
    }
    
}