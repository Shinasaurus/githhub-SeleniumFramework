package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Shinepage {
	
	@FindBy(how=How.ID, using = "shine")
	WebElement shine;
	
	@FindBy(how=How.NAME, using = "shineName")
	WebElement name;
	
	

}
