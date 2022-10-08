package webdriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
			
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com");//opens the URL

		 driver.close(); //closses only one window
		 
		 driver.quit();//closes multiple wondows
	}
}
