package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;
import utility.HandleDropDownListBox;

public class inventry_page extends TestBase
{
	//add xpath
	//Object Repository
	@FindBy(xpath="//span[text()='Products']") private WebElement productLable;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement backpackproduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement bikelableproduct; 
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private  WebElement boltTshirtsproduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']") private WebElement jacketproduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']") private WebElement onesieproduct;
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement Tshirtredproduct;
	//remove xpath
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")private WebElement backpackRemoveproduct;
	@FindBy(xpath="//button[@id='remove-sauce-labs-bike-light']")private WebElement bikelightRemoveproduct;
	@FindBy(xpath="//button[@id='remove-sauce-labs-bolt-t-shirt']")private WebElement boltTshirtRemoveproduct;
	@FindBy(xpath="//button[@id='remove-sauce-labs-fleece-jacket']")private WebElement jacketReomveproduct;
	@FindBy(xpath="//button[@id='remove-sauce-labs-onesie']']")private WebElement onesieRemoveproduct;
	@FindBy(xpath="//button[@id='remove-test.allthethings()-t-shirt-(red)']")private WebElement RedTshirtsRemoveproduct;
	@FindBy(xpath="//span[@class='shopping_cart_badge']") private WebElement cartcount;
	@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement cartIcon;
	@FindBy(xpath="//a[text()='Twitter']") private WebElement twitterLogo;
	@FindBy(xpath="//a[text()='Facebook']") private WebElement facebookLogo;
	@FindBy(xpath="//a[text()='LinkedIn']") private WebElement linkdinLogo;
	@FindBy(xpath="//select[@class='product_sort_container']") private WebElement productDropdown;
        public inventry_page()
        {
        	PageFactory.initElements(driver,this);
        }
        public String verifyproductlable()
        {
        	return productLable.getText();
        }
        public boolean verifyTwitterLogo()
        {
        	return twitterLogo.isDisplayed();
        }
        
        
           public String add6product()
        {
        	   HandleDropDownListBox.handleselectcListBoxlass(productDropdown, "Price (low to high)");
             backpackproduct.click();
			bikelableproduct.click();
			boltTshirtsproduct.click();
			jacketproduct.click();
			onesieproduct.click();
			Tshirtredproduct.click();
			return cartcount.getText();
        }
           public String remove2product()
           {
        	   add6product();
        	   backpackRemoveproduct.click();
        	   bikelightRemoveproduct.click();
			return cartcount.getText();
        	   
           }
           public void clickcartIcon()
           {
        	   cartIcon.click();
           }
           

}



