package pageObjects.initializePageObjects;

import controllers.BaseMethod;
import org.openqa.selenium.support.PageFactory;
import pageObjects.modules.GMailPageObjects;
import pageObjects.modules.GoogleHomePageObjects;
import pageObjects.modules.SauceLoginPageObjects;
import pageObjects.modules.SauceHomePageObjects;



public class PageFactoryInitializer extends BaseMethod {
    
	public GoogleHomePageObjects googleHomePage() {
        return PageFactory.initElements(getWebDriver(), GoogleHomePageObjects.class);
    }

    public GMailPageObjects gmailPage() {
        return PageFactory.initElements(getWebDriver(), GMailPageObjects.class);
    }
    
    public SauceLoginPageObjects loginPage() {
        return PageFactory.initElements(getWebDriver(), SauceLoginPageObjects.class);
    }
    
    public SauceHomePageObjects homePage() {
        return PageFactory.initElements(getWebDriver(), SauceHomePageObjects.class);
    }
    
    
}
