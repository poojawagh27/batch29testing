package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import base.TestBase;
import pages.LoginPage;
import pages.inventry_page;
import utility.ReadData;
import utility.Screenshot;

public class LoginPageTest extends TestBase 
{
	LoginPage login;
     @BeforeMethod(alwaysRun = true)
     public void setup() throws IOException, InterruptedException
     {
    	 initialization();
    	 login=new LoginPage();
    	 }
     @Test (enabled = true,priority = 1,groups = {"Retesting"})
     public void verifyTitleOfApplicationTest() throws EncryptedDocumentException, IOException
     {
    	 String expTitle=ReadData.readExel(0,0);//Swag Labs(0,0)
    	 String actTitle=login.verifyTitleOfApplication();
    	 Assert.assertEquals(expTitle, actTitle);
     }
     @Test  (enabled = true,priority = 3,groups = {"Sanity"})
     public void verifyURLApplicationTest() throws EncryptedDocumentException, IOException
     {
    	String expURL=ReadData.readExel(0,1);//https://www.saucedemo.com/(0,1)
    	String actURL=login.verifyURLofApplication();
    	Assert.assertEquals(actURL,expURL);
    	
     }
     @Test  (enabled = true,priority = 2,groups = {"Sanity","Regreession"})
     public void loginToApplication() throws IOException
     {
       String expURL=ReadData.readExel(0,2);//https://www.saucedemo.com/inventory.html(0,2)
       String actURL=login.loginToApplication();
       Assert.assertEquals(expURL,actURL);
       Reporter.log("After Login inventory page should be come = " + actURL);
     }
     @AfterMethod(alwaysRun = true)
     public void closeBrowser(ITestResult it) throws IOException
     {
    	 if(it.FAILURE==it.getStatus())
    	 {
    		Screenshot.Screenshot(it.getName()); 
    	 }
    	 driver.close();
     }
     
}
