package HandlingMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
				
				 WebDriver driver=new ChromeDriver();
				
				 driver.get("https://jqueryui.com/resizable/");
				 
				 Thread.sleep(6000);
				 
				 driver.switchTo().frame(0);
				 
				 WebElement resizable=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/h3[1]"));
				                     
				 Actions act=new Actions(driver);
				 
				 act.moveToElement(resizable).dragAndDropBy(resizable, 150, 150).build().perform();
				 
				 
	}

}
