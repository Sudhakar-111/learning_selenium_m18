package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_Axes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","./src/main/resources/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.in/");
	     
	     
		  //driver.findElement(By.name("q")).sendKeys("mobile");
		  //driver.findElement(By.className("kV1UjG")).click();
		  //Thread.sleep(2000);
		  
		  //1st
		  /*WebElement traverse = driver.findElement(By.xpath("//div[@class='tx4xZf StZidb']/ancestor::div[@class='QSCKDh dLgFEE col-2-12']/descendant::div[@title='5000 - 5999 mAh']"));
		  System.out.println(traverse.getText());*/
		  
		  //2nd
		//div[@class='FJ7IAS']/ancestor::div[@class='QSCKDh dLgFEE']/descendant::div[@class='FJ7IAS'][5]
		  
		  //3rd
	   //span[@id='nav-link-accountList-nav-line-1']/ancestor::div[@id='nav-tools']/descendant::a[@class='nav-a nav-a-2   nav-progressive-attribute'][2]
		  
		  /*WebElement name = driver.findElement(By.xpath("//div[@class='RG5Slk']"));
		  System.out.println(name.getText());
		  
		  WebElement price = driver.findElement(By.xpath("//div[@class='hZ3P6w DeU9vF']"));
		  System.out.println(price.getText());
		  WebElement details = driver.findElement(By.xpath("//div[@class='hZ3P6w DeU9vF']/ancestor::div[@class='ZFwe0M row']"));
		  System.out.println(details.getText());
		  driver.quit();*/
	}

}
