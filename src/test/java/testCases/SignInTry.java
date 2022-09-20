package testCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInTry {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.zoho.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login_id")).sendKeys("yokoiscool@gmail.com");
		driver.findElement(By.id("nextbtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Julia009");
		driver.findElement(By.xpath("//form[@id='login']//button[@id='nextbtn']")).click();
		Thread.sleep(5000);
		WebElement searchfield = driver.findElement(By.xpath("//*[@id='zgs20_gsQueryBox']"));
		searchfield.sendKeys("Forms");
		searchfield.click();
	//Assert.assertEquals(driver.getTitle(), "Zoho Home"); 
	System.out.println("djkasdklasd");

	}

}
