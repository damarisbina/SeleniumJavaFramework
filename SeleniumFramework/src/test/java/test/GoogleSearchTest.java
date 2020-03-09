package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//goto google.com
		driver.get("https://google.com");
		GoogleSearchPage.textbox_search(driver).sendKeys("Damaris Bin");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		System.out.println("Test Completed Successfully");
	}
	
	

}
