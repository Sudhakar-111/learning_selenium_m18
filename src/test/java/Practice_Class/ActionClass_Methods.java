package Practice_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass_Methods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		//total no of link present
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		
		WebElement header = driver.findElement(By.xpath("//div[@class='header']"));
		
		List<WebElement> headerLinks = header.findElements(By.tagName("a"));
		System.out.println(headerLinks.size());
		
		WebElement body = driver.findElement(By.xpath("//div[@class='master-wrapper-main']"));
		List<WebElement> bodyLinks = body.findElements(By.tagName("a"));
		System.out.println(bodyLinks.size());
		
		
	}

}
