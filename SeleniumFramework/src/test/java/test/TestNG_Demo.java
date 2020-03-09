package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class TestNG_Demo {

	WebDriver driver = null;
	public static String browserName = null;

	@BeforeTest
	public void setUpTest() {
		PropertiesFile.getProperties();
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		
	}
	
	@Test
	public void googleSearch() {
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);

		driver.get("http://google.com");
		searchPageObj.setTextInSearchBox("abcd");
		searchPageObj.clickSearchButton();
	}

	@AfterTest
	public void tearDownTest() {
		driver.close();
		System.out.println("Test Completed Successfully");
		PropertiesFile.setProperties();
	}
}
