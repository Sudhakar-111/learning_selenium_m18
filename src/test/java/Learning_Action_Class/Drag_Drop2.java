package Learning_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		Thread.sleep(2000);
	

		String[][]data= {
				{"Tokyo","Japan"},
				{"New Delhi","India"},
				{"Washington DC","USA"},
				{"Paris","France"},
				{"Berlin","Germany"},
				{"Ottawa","Canada"}
				
		};
		
		Actions action =new Actions(driver);
		
		for (String[] strings : data) {
			 WebElement source = driver.findElement(By.xpath("//div[text()='" + strings[0] + "']"));
	            WebElement destination = driver.findElement(By.xpath("//div[text()='" + strings[1] + "']"));

	            action.dragAndDrop(source, destination).perform();
	}
	}
}
