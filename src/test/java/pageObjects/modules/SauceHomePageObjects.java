
package pageObjects.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import pageObjects.initializePageObjects.PageFactoryInitializer;
import utils.RandomGenerator;


public class SauceHomePageObjects extends PageFactoryInitializer
{
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement btnAddTocart_BackPack;

	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")
	private WebElement btnAddTocart_BikeLight;
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	private WebElement btn_Yourcart;
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement btn_checkout;
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement txt_firstName;
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement txt_lastName;
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement txt_postalCode;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement btn_Continue;
	
	@FindBy(xpath="//button[@id='finish']")
	private WebElement btn_Finish;
	
	@FindBy(xpath="//button[@id='back-to-products']")
	private WebElement btn_BackHome;

	
	
	public SauceHomePageObjects addItems() throws Exception
	{		
		click(btnAddTocart_BackPack);
		click(btnAddTocart_BikeLight);
		return this;		
	}
	
	public SauceHomePageObjects clickOnYourCart() throws Exception
	{		
		click(btn_Yourcart);
		return this;		
	}
	
	public SauceHomePageObjects clickOnCheckout() throws Exception
	{		
		click(btn_checkout);
		return this;		
	}
	
	public SauceHomePageObjects enterUserInfo() throws Exception
	{		
		
		txt_firstName.sendKeys("Thomas");
		txt_lastName.sendKeys("Cook");
		txt_postalCode.sendKeys("112233");
		click(btn_Continue);
		return this;		
	}
	
	public SauceHomePageObjects clickOnFinish() throws Exception
	{		
		click(btn_Finish);
		return this;		
	}
	
	public SauceHomePageObjects clickOnBackHome() throws Exception
	{		
		click(btn_BackHome);
		return this;		
	}
	


	/*public SauceHomePageObjects verifyPageTitle() throws Exception 
	{
		Assert.assertEquals(getWebDriver().getTitle(), "Swag Labs");
		return this;
	}*/

}
