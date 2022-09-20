package base;


import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadPropertyFile;

public class BaseTestForDataProviderTest extends ReadPropertyFile{

	

	public WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() throws IOException {

		/*This child class can call/inherit a static method of parent class directly. As well as its static attributes: browser, url. If this parent method were non-static,
		 *  then an object of the child needs to be created in order to call this method.
		 */
	   
		propertyFileSetup();
		
		if (browser.equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("Edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
        driver.manage().window().maximize();
	
        driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
  //pretend edit by bloopy