package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import utility.ReadData;

public class LoginPage  extends TestBase
{
	//object repository
	@FindBy(xpath="//input[@id='user-name']") private WebElement usernameTxtBox;
	@FindBy(xpath="//input[@name='password']") private WebElement passwordTxtBox;
	@FindBy(xpath="//input[@id='login-button']")private WebElement loginBtn;
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}//constructor
	public String loginToApplication() throws IOException
	{
		usernameTxtBox.sendKeys(ReadData.readPropertyfile("Username"));
		passwordTxtBox.sendKeys(ReadData.readPropertyfile("Password"));
		loginBtn.click();
	    return driver.getCurrentUrl();
	
	}
	public String logintoApplicationMultiCreds(String un,String pass)
	{
		usernameTxtBox.sendKeys(un);
		passwordTxtBox.sendKeys(pass);
		loginBtn.click();
	    return driver.getCurrentUrl();
	
		
		
	}
	
    public String verifyTitleOfApplication()
    {
		return driver.getTitle();
    }
    public String verifyURLofApplication()
    {
		return driver.getCurrentUrl();
    	
    }
}
