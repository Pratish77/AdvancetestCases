package handlingdownloaduploadSikuliAutIT;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class DonloadAndUploadFilesUsingSikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
	
        //driver.manage().window().maximize();
        Thread.sleep(5000);
        
        WebElement element= driver.findElement(By.id("imagesrc"));
        
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);*/
		
		System.setProperty("webdriver.gecko.driver","C://Selenium docs//geckodriver-v0.31.0-win64//geckodriver.exe");
		  
	     WebDriver driver=new FirefoxDriver();
	      
	      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee");
	      
	      
	     WebElement element= driver.findElement(By.id("imagesrc"));
	     
	     JavascriptExecutor executor = (JavascriptExecutor)driver;
	     executor.executeScript("arguments[0].click();", element);
	
	    String imageFilepath="C://Users//Pratish Dama//OneDrive//Pictures//";
	    String inputFilepath="C://Users//Pratish Dama//OneDrive//Pictures//";
	    
	    Screen s=new Screen();
	    
	    Pattern fileInputTextBox=new Pattern(imageFilepath+"file.png");
	    Pattern openButton=new Pattern(inputFilepath+"file2.png");
	    
	    Thread.sleep(10000);
	    
	    s.wait(fileInputTextBox,20);
	    
	    s.type(fileInputTextBox,inputFilepath+"file3.png");
	    
	    s.click(openButton);
	    
	    }

}
