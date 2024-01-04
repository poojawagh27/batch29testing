package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheackOutpage1 extends TestBase
{
 @FindBy(xpath="//input[@id='first-name']")private WebElement firstnameTxtBox;
 @FindBy(xpath="//input[@id='last-name']")private WebElement lastnameTxtBox;
 @FindBy(xpath="//input[@id='postal-code']")private WebElement zipCodeTxtBox;
 @FindBy(xpath="//input[@name='continue']")private WebElement continueBtn;
 @FindBy(xpath="//span[text()='Checkout: Your Information']")private WebElement checkoutLable;
 @FindBy(xpath="//button[@name='cancel']")private WebElement cancleBtn;
 public CheackOutpage1()
 {
	 PageFactory.initElements(driver,this);
 }
 public String verifyURL()
 {
	 return driver.getCurrentUrl();
 }
 public String verifyLable()
 {
	return checkoutLable.getText();
	
 }
 public String cancleBtn()
 {
	 cancleBtn.click();
	 return driver.getCurrentUrl();
 }
    public String inputInfo()
    {
    	firstnameTxtBox.sendKeys("Harry");
    	lastnameTxtBox.sendKeys("Potter");
    	zipCodeTxtBox.sendKeys("354678");
    	continueBtn.click();
    	return driver.getCurrentUrl();
    	
    }
 
 
}
