package HandlingMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		
		 driver.get("https://demo.automationtesting.in/Register.html");
		 
		 Thread.sleep(6000);
		 
		 WebElement switchTo= driver.findElement(By.id("/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[4]/a[1]"));//.sendKeys("Admin");
		 
		 WebElement alerts=driver.findElement(By.id("//a[normalize-space()='Alerts']"));//.sendKeys("admin123");
		 
		 WebElement windows= driver.findElement(By.id("//a[normalize-space()='Windows']"));//.click();
		 
		 WebElement frames=driver.findElement(By.id("//a[normalize-space()='Frames']"));
		                     
		 Actions act=new Actions(driver);
		 
		 act.moveToElement(switchTo).build().perform();
		 
		 Thread.sleep(3000);
		 
		 act.moveToElement(alerts).click().build().perform();
		 //act.moveToElement(switchTo).click().build().perform();
		 
		 
		 act.moveToElement(switchTo).moveToElement(alerts).click().build().perform();
		 
	}

}
