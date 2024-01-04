package testCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheckOutPage2 extends TestBase
{
	@FindBy(xpath="//div[text()='Swag Labs']")private WebElement ApplogoTest;
	@FindBy(xpath="//button[text()='Open Menu']")private WebElement menuebtnText;
	@FindBy(xpath="//span[text()='Checkout: Overview']")private WebElement checkoutoverview;
	@FindBy(xpath="//div[text()='Payment Information']")private WebElement paymentinformationText;
	@FindBy(xpath="//div[text()='Shipping Information']")private WebElement shippinginformationText;
	@FindBy(xpath="//div[text()='Free Pony Express Delivery!']")private WebElement freedelevery;
	@FindBy(xpath="//div[text()='SauceCard #31337']")private WebElement sauceCard;
	@FindBy(xpath="//div[text()='Price Total']")private WebElement pricetotaltext;
	@FindBy(xpath="//div[@class='summary_subtotal_label']")private WebElement subtotalLable;
	@FindBy(xpath="//div[@class='summary_tax_label']")private WebElement taxLabel;
	@FindBy(xpath="//div[@class='summary_info_label summary_total_label']")private WebElement totalLable;
	@FindBy(xpath="//button[@name='cancel']") private WebElement cancleBtn;
	@FindBy(xpath="//button[@name='finish']") private WebElement finishBtn;
	public CheckOutPage2()
	{
		PageFactory.initElements(driver,this);
	}
	public String verifyURL()
	{
		return driver.getCurrentUrl();
		
	}
	public String verifycancleBtn()
	{
		cancleBtn.click();
		return driver.getCurrentUrl();
	}
	public String verifyfinishBtn()
		{
		finishBtn.click();
		return driver.getCurrentUrl();
		}
	 public String verifyApplogoTest()
	 {
		return ApplogoTest.getText();
	 }
	  public void menuebtnText()
	  {
		  menuebtnText.click(); 
	  }
	public String verifycheckoutoverview()
	{
		return checkoutoverview.getText();
	}
	public String verifypaymentinformationText()
	{
		return paymentinformationText.getText();
	}
	public String verifyshippinginformationText()
	{
		return shippinginformationText.getText();
		
	}
	public String verifyfreedelevery()
	{
		return freedelevery.getText();
	}
	public String verifysauceCard()
	{
		return sauceCard.getText();
	}
	public String verifypricetotaltext()
	{
		return pricetotaltext.getText();
	}
	public String verifysubtotalLable()
	{
		return subtotalLable.getText();
	}
	 public String verifytaxLabel()
	 {
		 return taxLabel.getText();
	 }
	 public String verifytotalLable()
	 {
		 return totalLable.getText();
	 }
	}

	

