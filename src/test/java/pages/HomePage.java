package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HomePage {

	@FindBy(how=How.ID, using="ztb-profile-image")
	@CacheLookup
	WebElement profilePhoto;
	
	@FindBy(how=How.XPATH, using="//button[@class='zf-userSignOut']")
	@CacheLookup
	WebElement signOut;
	
	
public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	} 
	
	public void logOut() throws InterruptedException {
		
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.moveToElement(profilePhoto).click().build().perform();
	    signOut.click();
		
	Assert.assertEquals(driver.getTitle(), "Zoho - Cloud Software Suite and SaaS Applications for Businesses");
	System.out.println("My name is Hua");
		
	}

}
