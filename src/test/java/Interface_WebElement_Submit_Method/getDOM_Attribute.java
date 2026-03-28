package Interface_WebElement_Submit_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getDOM_Attribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		 WebElement search = driver.findElement( By.id("small-searchterms"));
	       System.out.println("--before");
	       System.out.println(search.getDomAttribute("value"));
	       System.out.println(search.getDomProperty("value"));
	       System.out.println("=================================");
	       search.sendKeys("laptop");
	       System.out.println(search.getDomAttribute("value"));
	       System.out.println(search.getDomProperty("value"));
	       driver.quit();
	}

}
