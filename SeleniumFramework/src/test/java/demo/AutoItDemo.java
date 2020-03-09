package demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoItDemo {

	public static void main(String[] args) throws Exception {
		test();
	}

	public static void test() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.tinyupload.com/");

		System.out.println("got the element");
		
		//Thread.sleep(3000);
		
		driver.findElement(By.name("uploaded_file")).sendKeys("C:\\Users\\OnyangoDamaris\\Documents\\Bina Storage BackUp\\RequiredItems.pdf");
		
		System.out.println("got the other one");


		//Runtime.getRuntime().exec("C:\\Users\\OnyangoDamaris\\Documents\\FileUploadScript.exe");

		Thread.sleep(3000);
		//driver.close();

	}

}
