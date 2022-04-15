import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver version\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}
	@Test
	public void LoginGmail() {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver version\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	String title=	driver.findElement(By.xpath("//*[@id=\"headingText\"]/span")).getText();
	Assert.assertEquals(title, "Sign in");
	}
	@Test
	public void LoginGmail1() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("rakeshharer2103@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
	driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span")).click();
	
	}
	
}
