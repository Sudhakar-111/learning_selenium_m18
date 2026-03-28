package Search_Context_Interface;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestion_task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.ajio.com/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      
      driver.findElement(By.name("searchVal")).sendKeys("Tshirt");
      
      List<WebElement> suggestions2 = driver.findElements(By.xpath("//a[@class='search-suggestionList  ']"));
      
      for(int i=0; i<suggestions2.size(); i++) {
    	  
    	  WebElement suggestion2 = suggestions2.get(i);
    	  System.out.println(suggestion2.getText());
      }
	}

}
