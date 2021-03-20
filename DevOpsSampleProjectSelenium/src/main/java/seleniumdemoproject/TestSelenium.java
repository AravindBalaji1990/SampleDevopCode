package seleniumdemoproject;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium {
	// initialise the webdriver
	// interface
	WebDriver driver;

	@BeforeTest
	public void open() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumSession\\Selenium_Class\\LatestBrowserJar\\chromedriver_win32_89\\chromedriver.exe");
		// chrome browser initailisation
		driver = new ChromeDriver();
		// url should have http or https
		driver.get("https://www.google.com/");
	}

	@Test
	public void testcase01() throws InterruptedException {
		assertTrue(driver.getTitle().equals("Google"));
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='dRYYxd']//span[@jsname='itVqKe']")).click();

	}

	@AfterTest
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();

	}

}
