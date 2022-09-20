package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTestForDataProviderTest;
import pages.HomePage;
import pages.SignInPage2;
import utilities.DataProviderForEmailNPass;
import utilities.ReadXLSdata;



public class TestLoginWithDataProvider extends BaseTestForDataProviderTest {

		/*If DataProvider is in a separate class from Test class or base class, Dataprovider method needs to be STATIC
		 * and Data Provider class needs to be name with attribute: dataProviderClass like below. 
		if dataProvider is named, provide its name, if not, provide its methodname as Name */
	


//@Test( dataProvider = "testData", dataProviderClass=DataProviderForEmailNPass.class)
	
@Test(dataProvider = "exceldp", dataProviderClass= ReadXLSdata.class)
		public void logInTest(String email, String pass ) throws InterruptedException {
	
			/*Instead of instantiate an object of pageObejct class using PageFactory like below, 
			 * this can also be done in the page object class constructor too. See SignInPage2 class file */
			 
			//SignInPage2 sip = PageFactory.initElements(driver, SignInPage2.class);
	
	SignInPage2	 sip = new SignInPage2(driver);
		sip.signIn(email, pass);
		
		}


}




