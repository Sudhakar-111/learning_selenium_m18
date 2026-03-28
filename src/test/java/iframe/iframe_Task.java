package iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe_Task {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(2000);
		
		//1st frame
		driver.findElement(By.className("frmTextBox")).sendKeys("jjfjfkek");
		Thread.sleep(2000);
		driver.switchTo().frame(1);//2
		driver.findElement(By.xpath("//option[@value='java']")).click();//3
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='ec']")).click();//4
		Thread.sleep(2000);
		
		//switch to default main frame
		driver.switchTo().defaultContent();//5
		driver.findElement(By.className("frmTextBox")).clear();//6
		Thread.sleep(2000);
		driver.switchTo().frame(2);//7
		driver.findElement(By.id("firstName")).sendKeys("mango");//8
		driver.findElement(By.id("lastName")).sendKeys("123");
		driver.findElement(By.id("malerb")).click();
		Thread.sleep(2000);
		
		List<WebElement> language = driver.findElements(By.xpath("//input[@class='bcCheckBox' and @type='checkbox']"));
		
		for(int i=0;i<3;i++) {
		language.get(i).click();	
		}
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("mango123@gmail.com");
		Thread.sleep(2000);
		
		//change to default frame
		driver.switchTo().defaultContent();//9
		driver.findElement(By.className("frmTextBox")).clear();
		Thread.sleep(2000);
		driver.findElement(By.className("frmTextBox")).sendKeys("jjfjfkek");//10
		Thread.sleep(2000);
		
		driver.switchTo().frame("frm3");//11
		driver.findElement(By.id("name")).sendKeys("hi 3rdframe");//12
		Thread.sleep(2000);
		
		//nested frame 1frame into 3rdframe
		driver.switchTo().frame("frm1");//13
		driver.findElement(By.xpath("//option[@value='java']")).click();//14
		Thread.sleep(2000);
		
		//parent frame
		driver.switchTo().parentFrame();//15
		driver.findElement(By.className("frmTextBox")).clear();//16
		Thread.sleep(2000);
		
		//switch to main frame
		driver.switchTo().defaultContent();//17
		driver.findElement(By.className("frmTextBox")).clear();
	}
}