package Practice_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Operational_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		Thread.sleep(3000);
		
		WebElement country = driver.findElement(By.name("country"));
		Select sel = new Select(country);
		
		//Fetch all options from the drop down
		List<WebElement> options = sel.getOptions();
		
		for (int i=1; i<options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
		System.out.println("---------------------------");
		
		WebElement element = sel.getWrappedElement();
		System.out.println(element.getText());
		System.out.println("=====================================");
		System.out.println(sel.isMultiple());
			
	}

}
