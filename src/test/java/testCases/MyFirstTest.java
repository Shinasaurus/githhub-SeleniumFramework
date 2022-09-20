package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.zoho.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login_id")).sendKeys("shinasaurus@gmail.com");
		driver.findElement(By.xpath("//form[@id='login']//button[@id='nextbtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Juliasaurus#9");
		driver.findElement(By.xpath("//form[@id='login']//button[@id='nextbtn']")).click();
	}

}
