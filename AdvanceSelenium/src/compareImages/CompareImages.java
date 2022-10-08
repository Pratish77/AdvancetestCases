package compareImages;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CompareImages {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		
		 driver.get("http://demo.automationtesting.in/Register.html");
	       Thread.sleep(2000);
	  
	       WebElement webElement = driver.findElement(By.cssSelector("#imagetrgt"));
	  
	       Screenshot screenshot = new AShot().takeScreenshot(driver,webElement);
	       ImageIO.write(screenshot.getImage(),"PNG",new File(System.getProperty("user.dir") +"\\Images\\ElementScreenshot.png"));
	  
	       Thread.sleep(2000);
	       driver.quit();
	     File file=new File("C://Users/Pratish Dama/OneDrive/Pictures/Screenshots/compareimages.png");
	     
	     if(file.exists()) {
	    	System.out.println("file is existing"); 
	     }else
	     {
	    	 System.out.println("file is not existing");  
	     }
	}

}
