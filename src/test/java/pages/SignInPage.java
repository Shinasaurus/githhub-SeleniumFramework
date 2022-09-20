/**
 * 
 */
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Hua
 *
 */
public class SignInPage {
	
	
	
	@FindBy(how=How.LINK_TEXT, using="Sign in")
	@CacheLookup
	WebElement signIn;
	
	@FindBy(how=How.ID, using="login_id")
	@CacheLookup
	WebElement email;
	
	@FindBy(how=How.ID, using="nextbtn")
	@CacheLookup
	WebElement nextButton;
	
	@FindBy(how=How.XPATH, using="//input[@id='password']")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH, using="//form[@id='login']//button[@id='nextbtn']")
	@CacheLookup
	WebElement logInButton;
	
public WebDriver driver;
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
	} 
	public void signIn(String useremail, String pass) {
		
		signIn.click();
		email.sendKeys(useremail);
		nextButton.click();
		password.sendKeys(pass);
		logInButton.click();
	}

}
