package tests;

import controllers.ExcelDataProvider;
import org.testng.annotations.Test;
import pageObjects.initializePageObjects.PageFactoryInitializer;

public class EndToEndTest extends PageFactoryInitializer {
    
	/*@Test(dataProvider = "excelSheetNameAsMethodName", dataProviderClass = ExcelDataProvider.class)
    public void testGoogle(String testCaseID, String emailID, String password) throws Exception {
        googleHomePage().verifyPageTitle();
    }*/

	
	@Test
	public void verifyEndToEndTest() throws Exception
	{
		loginPage().enterUsername();
		loginPage().enterPassword();
		loginPage().clickLogin();
		homePage().addItems();
		homePage().clickOnYourCart();
		homePage().clickOnCheckout();
		homePage().enterUserInfo();
		homePage().clickOnFinish();
		homePage().clickOnBackHome();
	}
	
	
	
}
