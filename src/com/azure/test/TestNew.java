package com.azure.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNew {
	
	 public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Sign in")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
