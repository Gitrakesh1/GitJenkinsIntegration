import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
	
	@Test
	public void LoginTest3() {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/selenium/selenium%20jar/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		String labelsubheading = driver.findElement(By.xpath("/html/body/div/div[1]/a/h4")).getText();
		Assert.assertEquals(labelsubheading, "JAVA | SELENIUM | PYTHON");
}
}