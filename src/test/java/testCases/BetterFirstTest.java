package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BetterFirstTest extends BaseTest{

	@Test
	public void loginTest() throws InterruptedException {
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login_id")).sendKeys("shinasaurus@gmail.com");
		driver.findElement(By.xpath("//form[@id='login']//button[@id='nextbtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Juliasaurus#9");
		driver.findElement(By.xpath("//form[@id='login']//button[@id='nextbtn']")).click();
		Thread.sleep(2000);
	}

}
