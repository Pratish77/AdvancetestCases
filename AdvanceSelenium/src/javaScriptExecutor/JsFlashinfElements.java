package javaScriptExecutor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsFlashinfElements {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		 System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.facebook.com/");
		 
		 driver.manage().window().maximize();
		 
		 WebElement element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]"));
		 
		// FlashingOrHighlightingElements.flash(element, driver);
	
	    //Drawing border
		// FlashingOrHighlightingElements.drawBorder(element,driver);
	
		// File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		// FileUtils.copyFile(src, new File("C://Users//Pratish Dama//OneDrive//Pictures//Screenshots//faceboob.png"));
	
	    //capture title of the page
		 
		// System.out.println(driver.getTitle());
		 
		 FlashingOrHighlightingElements.clickElementbyjs(element, driver);
		 
		 FlashingOrHighlightingElements.generateAlert("Clicked on login button", driver);
		 
		 FlashingOrHighlightingElements.refreshBrowserbyusingjs(driver);
	
	
	
	
	
	
	
	}

}
