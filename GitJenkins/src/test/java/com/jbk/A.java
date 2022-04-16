package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/selenium/javabykiran-Selenium-Softwares--offline/Offline%20Website/index.html");
		String d = driver.findElement(By.xpath("/html/body/div/div[1]/a/b")).getText();
		Assert.assertEquals(d, "Java By Kiran");
	}

}
