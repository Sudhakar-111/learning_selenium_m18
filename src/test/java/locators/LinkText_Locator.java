package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       	       Thread.sleep(2000);
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/");
	       Thread.sleep(2000);
	       

	       driver.findElement(By.linkText("Forgotten password?")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.linkText("Forgotten account?")).click();
	       Thread.sleep(2000);
	       
	       driver.close(); //close the 1st window
	       Thread.sleep(2000);
	       
	       driver.quit();
	       
	}

}
