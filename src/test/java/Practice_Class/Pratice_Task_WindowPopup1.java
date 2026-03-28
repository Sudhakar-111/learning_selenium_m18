package Practice_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pratice_Task_WindowPopup1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));
		
	
		/*for(int i=0; i<checkboxes.size();i++) {
			
			checkboxes.get(i).click();
		}*/
		
		/*for(WebElement checkbox:checkboxes) {
			
			checkbox.click();
		}*/
		
		/*for(int i=4; i<checkboxes.size();i++) {
			
			checkboxes.get(i).click();//Last 3 checkboxes 
		}*/
		
		for(int i=0; i<3; i++) {
			
			checkboxes.get(i).click();
		}
	}

}
