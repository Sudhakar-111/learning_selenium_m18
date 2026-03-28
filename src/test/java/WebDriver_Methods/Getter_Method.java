package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getter_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.name("login"));
		System.out.println(element.getText());
		System.out.println("-------------------------------------------");
		
		
		System.out.println(element.getAttribute("class"));
		System.out.println(element.getAttribute("type"));
		System.out.println(element.getAttribute("value"));
		System.out.println(element.getAttribute("name"));
		System.out.println("--------------------------------------------");
		System.out.println(element.getTagName());
		System.out.println("-------------------------------------------");
		
		System.out.println(element.getCssValue("background-color"));
		System.out.println(element.getCssValue("border-radius"));
		System.out.println(element.getCssValue("font-size"));
		System.out.println(element.getCssValue("line-height"));
		System.out.println("---------------------------------------------");
		
		Dimension size = element.getSize();
		System.out.println(size);
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		System.out.println("--------------------------------------------");
		
		Point location = element.getLocation();
		System.out.println(location);
		System.out.println(location.getX());
		System.out.println(location.getY());
		System.out.println("-----------------------------------------");
		
		Rectangle rect = element.getRect();
		System.out.println(rect);
		System.out.println(rect.getX());
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.getY());
	}
}
