/**
 * 
 */
package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * @author Hua
 *
 */
public class SignInPage2 {
	
	
	
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
	
	public SignInPage2(WebDriver driver) {
		this.driver = driver;
		//this keyword refers to this class here-- "SignInPag2"
		PageFactory.initElements(driver, this); //this method is used to initialize all the elements declared on this page via @FindBy 
	} 
	
	public void signIn(String useremail, String pass) throws InterruptedException {
		
		signIn.click();
		email.sendKeys(useremail);
		nextButton.click();
		password.sendKeys(pass);
		logInButton.click();
		Thread.sleep(5000);
	Assert.assertEquals(driver.getTitle(), "Zoho Home");
	System.out.println("My name is Hua");
		
	}

}
