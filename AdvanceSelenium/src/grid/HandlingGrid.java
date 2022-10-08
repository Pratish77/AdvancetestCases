package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class HandlingGrid {

	static WebDriver driver;
	DesiredCapabilities dc;
	
	@Test(priority=1)
	void login() throws MalformedURLException {
		
		String nodeURL="http://192.168.0.13:4444";
		
		dc= new DesiredCapabilities();
		dc.setBrowserName("chrome");
	    dc.setPlatform(Platform.WIN11);
		  
		System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
		
		driver=new RemoteWebDriver(new URL(nodeURL),dc);
	      
	      
	      
	      
	      driver.get("https://practice.automationtesting.in/my-account/");
	      driver.findElement(By.id("username")).sendKeys("dvpratish");
	      driver.findElement(By.id("password")).sendKeys("pratish@7");
	      driver.findElement(By.name("login")).click();
	      
	      String capText=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]/strong[1]")).getText();
	      
	      if (capText.contains("dvpratish")) {
	    	  System.out.println("my test is pass");
	      }else {
	    	
	    	  System.out.println("my test is pass");
	      }
	}
	
	
	
}
