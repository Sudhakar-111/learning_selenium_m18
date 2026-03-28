package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.chromedriver","./src/main/resources/chromedriver.exe");
		     WebDriver driver = new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.get("https://www.amazon.in/");
		     Thread.sleep(4000);
		     
		     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		     driver.findElement(By.id("nav-search-submit-button")).click();
		     
	//find the name
		     WebElement name = driver.findElement(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-line-clamp-3-for-col-12 s-link-style a-text-normal'][1]"));
		     System.out.println(name.getText());
		     
		     // find the price
		     WebElement price = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]"));
		     System.out.println(price.getText());
		     
		       //find the mrp 
		     WebElement MRP = driver.findElement(By.xpath("//div[@class='a-section aok-inline-block'][1]"));
		     System.out.println(MRP.getText());
		     // find the delivery date 
		     WebElement date = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-padding-none udm-delivery-block'][1]"));
		     System.out.println(date.getText());
		     
		     // find the discount ////span[text()='(29% off)']
		     WebElement percentage = driver.findElement(By.xpath("//span[text()='(29% off)']"))	;
		     System.out.println(percentage.getText());
		  }

}
