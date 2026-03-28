package Search_Context_Interface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_findelements_Method {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demowebshop.tricentis.com/");
	 
	     List<WebElement> textFields = driver.findElements(By.xpath("//input[@type='text' or @type='email' or @type='password']"));

			for (int i =0; i<textFields.size(); i++) {
				textFields.get(i).sendKeys("Hello");
			}

			// 2. Click on all radio buttons
			List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));

			for (int i =0; i<radioButtons.size(); i++) {
				radioButtons.get(i).click();
			}

			// 3. Fetch value of every button
			List<WebElement> buttons = driver.findElements(By.xpath("//button | //input[@type='submit' or @type='button']"));

			for (int i=0; i<buttons.size(); i++) {
				{
				String attribute = buttons.get(i).getAttribute("value");
                    System.out.println(attribute);
								
			}
			}
	}
}

