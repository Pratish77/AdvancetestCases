package naVigateCommands;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.getTitle();
		
		driver.navigate().to("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		driver.quit();
		 
		 
	}

}
