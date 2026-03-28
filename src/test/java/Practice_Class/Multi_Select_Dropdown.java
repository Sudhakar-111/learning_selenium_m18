package Practice_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multi_Select_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
		Thread.sleep(4000);
		
		WebElement month = driver.findElement(By.name("Month"));
		Select sel = new Select(month);
		
		sel.selectByIndex(3);
		sel.selectByValue("Sept");
		sel.selectByValue("Jan");
		sel.selectByContainsVisibleText("Oct");
		Thread.sleep(2000);
		
		sel.deselectByIndex(9);
		sel.deselectByValue("Ma");
		sel.deselectByValue("Jan");
		sel.deSelectByContainsVisibleText("Oct");
		
		
		}

}
