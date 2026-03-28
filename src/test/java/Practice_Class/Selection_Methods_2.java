package Practice_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selection_Methods_2 {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.name("Month"));
		Select sel = new Select(month);
		
		List<WebElement> options = sel.getOptions();
		for(WebElement option : options) {
		
			String text = option.getText();
			sel.deselectByVisibleText(text);
			Thread.sleep(2000);
	}
		
		List<WebElement> selectOptions = sel.getAllSelectedOptions();
		for(WebElement option : selectOptions) {
			
			System.out.println(option.getText());
		}
	}
}
