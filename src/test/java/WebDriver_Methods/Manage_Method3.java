package WebDriver_Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Method3 {
		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.edge.driver", "./src/main/resources/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.instagram.com/");
			
			
			//Point.position = driver.manage().window().getPosition();
			//System.out.println(position);
			//System.out.println(position.getX());
			//System.out.println(position.getY());
			//Thread.sleep(2000);
			
			
					}

}
