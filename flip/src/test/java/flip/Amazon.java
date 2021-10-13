package flip;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	static WebDriver driver;
	static long startTime;
	
	
	@BeforeClass
	public static void beforeClass() throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver", "F:\\\\java\\\\Selenium\\\\drivers\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(3000);

	}
	
	@Before
	public void beforeMethod() {
		
		 startTime = System.currentTimeMillis();

	}
	
	@AfterClass
	public static void afterClass() {
		
		driver.quit();

	}
	
	@After
	public void afterMethod() {
		
		long endTime = System.currentTimeMillis();
		System.out.println("That took " + (endTime - startTime) + " milliseconds");

	}
	
	@Test
	public void m1() throws Throwable {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		
		Thread.sleep(2000);

	}

}
