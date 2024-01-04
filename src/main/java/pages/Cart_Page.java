package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Cart_Page extends TestBase
{
	 @FindBy(xpath="//span[text()='Your Cart']") private WebElement cartpageLable;
	   @FindBy(xpath="//button[@id='continue-shopping']") private WebElement continueshoppingbtn;
	   @FindBy(xpath="//button[@id='checkout']") private WebElement checkoutbtn;
	   public Cart_Page()
	   {
		   PageFactory.initElements(driver,this);
	   }
	   public String verifyCartpageurl()
	   {
		  return  driver.getCurrentUrl();
	   }
	
	   public String verifyCartPageLable()
	   {
		   return cartpageLable.getText();
	   }
	   public String clickoncontinueshopping()
	   {
		   continueshoppingbtn.click(); 
		  return driver.getCurrentUrl();
	   }
	   public void ClickOnCheckoutBtn()
	   {
		   checkoutbtn.click();
		   driver.getCurrentUrl();
	   }

}
