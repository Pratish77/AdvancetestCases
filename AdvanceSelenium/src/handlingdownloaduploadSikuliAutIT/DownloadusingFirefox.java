package handlingdownloaduploadSikuliAutIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v104.browser.Browser;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadusingFirefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		 System.setProperty("webdriver.gecko.driver","C://Selenium docs//geckodriver-v0.31.0-win64//geckodriver.exe");
		 
		 //creating the browser profile
		 FirefoxProfile profile=new FirefoxProfile();
		 
		 profile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/plain");//set mime types
		 
		 profile.setPreference("browser.download.manager.showWhenStarting", false);
		 
		 FirefoxOptions option=new FirefoxOptions();
		 
		 option.setProfile(profile);
		 
		 WebDriver driver=new FirefoxDriver();
		 
		 driver.get("https://demo.automationtesting.in/FileDownload.html");
		 
		 driver.findElement(By.id("textbox")).sendKeys("firefoxdownload");
		 
		 WebElement generatetxt=driver.findElement(By.id("createTxt"));
		 
		 Thread.sleep(3000);
		 
		 if(generatetxt.isDisplayed()==true) {
			 System.out.println(generatetxt.isDisplayed());
			 Thread.sleep(3000);
			 generatetxt.click();
		 }
	     driver.findElement(By.id("link-to-download")).click();
		 
		 //Zip file download
	     
	     /*
	      * 
	      * 
	      * 
	      * 
	      * 
	      * 
	      * 
	      * 
	      * 
	      * 
	      * 
	      * 
	      * 
	      */
	
	
	}

}
