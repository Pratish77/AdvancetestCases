package HandlingMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		
		 driver.get("https://jqueryui.com/droppable/");
		 
		 Thread.sleep(4000);
		 
		 WebElement source= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/p[1]"));//.click();
		 
		 WebElement target=driver.findElement(By.xpath("/html[1]/body[1]"));
		                     
		 Actions act=new Actions(driver);
		 

		 Thread.sleep(6000);
		// act.clickAndHold(source).moveToElement(target).release().build().perform();
		 
		 act.dragAndDrop(source, target).build().perform();
	}

}
