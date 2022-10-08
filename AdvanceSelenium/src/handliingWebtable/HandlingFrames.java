package handliingWebtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		
		 driver.get("https://demo.automationtesting.in/Alerts.html");
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	
	    //switch to alert box
		 
		 Alert alert=driver.switchTo().alert();
		 
		  String alerttext=alert.getText();
		  
		  System.out.println(alerttext);
		  alert.accept();//ok button will be clicked
	
	
	}

}
