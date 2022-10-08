package headLeassBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessBrowising {

	public static void main(String[]args) { 
		
		
		/* FirefoxOptions foptions=new FirefoxOptions();
		 foptions.addArguments("--headless");
		 foptions.setHeadless(true);*/
		 
		 
		
		
		 System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
			
		 ChromeOptions options=new ChromeOptions();
		 //options.setHeadless(true);
		 options.addArguments("  --headless");
		 
		 WebDriver driver=new ChromeDriver(options);
		 
		 driver.get("https://www.facebook.com");
		 
		String expected=driver.getTitle();
		  
			 System.out.println(expected);
	}
}
