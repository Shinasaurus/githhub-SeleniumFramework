/**
 * 
 */
package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.SignInPage;

/**
 * @author Hua
 *
 */
public class BestFirstTest extends BaseTest{
	
	@Test
	public void verifyLogIn() {
		
		SignInPage	 sip = PageFactory.initElements(driver, SignInPage.class);
		sip.signIn(p.getProperty("email"), p.getProperty("pass"));
	}

}
