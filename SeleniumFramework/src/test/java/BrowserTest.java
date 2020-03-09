import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) {
		//		String projectPath = System.getProperty("user.dir");
		//		//System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver/geckodriver.exe");
		//		//WebDriver driver = new FirefoxDriver();
		//
		//		//System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
		//		//		WebDriver driver = new ChromeDriver();
		//		System.setProperty("webdriver.ie.driver", projectPath + "/drivers/iedriver/IEDriverServer.exe");
		//		WebDriver driver = new InternetExplorerDriver();
		//		driver.get("https://selenium.dev/");
		//		try {
		//			Thread.sleep(3000);
		//		} catch (InterruptedException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
		//		driver.close();

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.dev/");
		WebElement textBox = driver.findElement(By.id("gsc-i-id1"));
		textBox.sendKeys("Automation by Bina");
		List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		int count = listOfInputElements.size();
		System.out.println(count);
		//System.out.println("hello there");
		//driver.close();


	}

}
