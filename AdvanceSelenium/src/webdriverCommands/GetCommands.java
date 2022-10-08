package webdriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
			
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com");//opens the URL
		 
		 driver.getTitle();//returns title of the page
		 
		 driver.getCurrentUrl();//returns the url of the current page
		 
		 //webelement element.getText//returns the text of the element
		 driver.close();//close the current window
		 driver.quit();//closes the multiple windows
	}

}
