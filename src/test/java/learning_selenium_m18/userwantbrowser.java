package learning_selenium_m18;

import  java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class userwantbrowser {

	public static void main(String[]args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			WebDriver driver = null;
			
			System.out.println("Select Browser: ");
			
			System.out.println("1.Chrome");
			System.out.println("2.Edge");
			int browser = sc.nextInt();
			
			switch(browser) {
			case 1: 
				System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
				 driver = new ChromeDriver();
				break;
				
			case 2:
				System.setProperty("webdriver.edge.driver", "./src/main/resources/msedgedriver.exe");
				 driver = new EdgeDriver();
				break;
				
			default:
				System.out.println("Invalid browser selection");
				sc.close();
				return;
			}
				
				System.out.println("enter website name only");
				String site = sc.next();
				
				String url = "https://www." + site + ".com/";
				driver.get(url);
				
				
				System.out.println("What you want to fetch?");
				System.out.println("1. Title");
				System.out.println("2. URL");
				
				int fetch = sc.nextInt();
				
				switch(fetch) {
				case 1:
					System.out.println("Page Title is: " + driver.getTitle());
					break;
				
				
				case 2:
					System.out.println("Currenturl is: " + driver.getCurrentUrl());
					break;
					
				default:
					System.out.println("Invalid Option");
				}
				
				
				try {
				Thread.sleep(5000);
			}catch (Exception e) {}
				
				driver.quit();
		}

		}
	}

