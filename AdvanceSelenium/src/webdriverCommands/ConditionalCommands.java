package webdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionalCommands {

	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.get("https://www.facebook.com");
	         
//System.setProperty("webdriver.gecko.driver","C://Selenium docs//geckodriver-v0.31.0-win64//geckodriver.exe");
	//WebDriver  driver=new FirefoxDriver();
	  
	 driver.get("https://www.facebook.com");
	 
	WebElement usernametextbox= driver.findElement(By.name("email"));
	    
	//System.out.println(usernametextbox.isDisplayed());
	 
	WebElement passtextbox= driver.findElement(By.name("pass"));
	
	//WebElement radiobutton= driver.findElement(By.name("radio button"));
	 
	// driver.findElement(By.name("login")).click();
	 
	 
	 if(usernametextbox.isDisplayed()&&usernametextbox.isEnabled())
	 { 
		 usernametextbox.sendKeys("9966414466");
		
		 System.out.println("test passed");
	 }if(passtextbox.isDisplayed()&&passtextbox.isDisplayed()) {
		 
		 passtextbox.sendKeys("Pratishkumar@77");
		 
		 System.out.println("test failed");
		 
	 }
	/* radiobutton.isSelecte();
	 
	 if(radiobutton.isSelecte()==false) {
		 radiobutton.click();
	 }*/
	 }
		
	}



