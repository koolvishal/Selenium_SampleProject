package tests;

import controllers.ExcelDataProvider;
import org.testng.annotations.Test;
import pageObjects.initializePageObjects.PageFactoryInitializer;

public class LoginTest extends PageFactoryInitializer {
    
	/*@Test(dataProvider = "excelSheetNameAsMethodName", dataProviderClass = ExcelDataProvider.class)
    public void testGoogle(String testCaseID, String emailID, String password) throws Exception {
        googleHomePage().verifyPageTitle();
    }*/
	
	
	
	@Test
	public void verifyLogin()
	{
		loginPage().enterUsername();
		loginPage().enterPassword();
		loginPage().clickLogin();
		
	}
	
	
	
}
