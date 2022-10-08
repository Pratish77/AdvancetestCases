package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	static WebDriver driver;
	
	public static void main(String[]args) {
		
	 System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
		         driver=new ChromeDriver();
		         
	/*System.setProperty("webdriver.gecko.driver","C://Selenium docs//geckodriver-v0.31.0-win64//geckodriver.exe");
		  driver=new FirefoxDriver();*/
		         
		  driver.get("www.facebook.com");
}
}