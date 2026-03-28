package Interface_WebElement_Submit_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).clear();
	}

}
