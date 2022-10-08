package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class HandlingScrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		 
		 driver.manage().window().maximize();
		 
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 
		 //1.scrolling by using pixel
		 
		 //js.executeScript("window.scrollBy(0,1000)","");
		 
		 //scrolling element till finding the element
		 
		 //WebElement flag=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/table[2]/tbody[1]/tr[96]/td[2]"));
         //js.executeScript("arguments[0].scrollIntoView();",flag);
		 
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 
		 
		 
		 
		 
		 
		 
		 
         
         
		 
		 
	}

}
