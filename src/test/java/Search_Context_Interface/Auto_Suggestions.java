package Search_Context_Interface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("virat kohli");
        Thread.sleep(2000);
        
        List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
        
        for(int i =0; i < suggestions.size(); i++) {
        	
        	WebElement suggestion = suggestions.get(i);
        	System.out.println(suggestion.getText());
        }
        System.out.println(suggestions.size());
        
        
        for(WebElement sug: suggestions) {
        	if(sug.getText().equals("virat kohli test cricket return")) {
        		sug.click();
        		break;
        		
        	}
        }
	}

	
}
