
package pageObjects.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import pageObjects.initializePageObjects.PageFactoryInitializer;
import utils.RandomGenerator;


public class SauceLoginPageObjects extends PageFactoryInitializer
{
	@FindBy(id="user-name")
	private WebElement txtUsername;

	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(id="login-button")
	private WebElement btnLogin;

	
	/*public SauceLoginPageObjects clickonGmailLink() throws Exception
	{		
		click(GmailLink);
		return this;		
	}*/

	
	

	public SauceLoginPageObjects enterUsername() 
	{
		//txtUsername.sendKeys(RandomGenerator.GenerateRandomEMAILIDs("google.com"));
		txtUsername.sendKeys("standard_user");
		return this;	
	}
	
	public SauceLoginPageObjects enterPassword() 
	{
		//txtUsername.sendKeys(RandomGenerator.GenerateRandomEMAILIDs("google.com"));
		txtPassword.sendKeys("secret_sauce");
		return this;	
	}

	public SauceLoginPageObjects clickLogin() 
	{
		//txtUsername.sendKeys(RandomGenerator.GenerateRandomEMAILIDs("google.com"));
		btnLogin.click();
		return this;	
	}
	
	
	public SauceLoginPageObjects verifyPageTitle() throws Exception 
	{
		Assert.assertEquals(getWebDriver().getTitle(), "Swag Labs");
		return this;
	}

}
