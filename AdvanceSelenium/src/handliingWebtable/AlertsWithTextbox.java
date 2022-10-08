package handliingWebtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsWithTextbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		
		 driver.get("https://demo.automationtesting.in/Alerts.html");
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();////p[@id='demo']
	
	    //switch to alert box
		 
		 Alert alert=driver.switchTo().alert();
		 
		 alert.sendKeys("Pratyush");
		 
		  String alerttext=alert.getText();
		  
		  System.out.println(alerttext);
		 
		  alert.accept();//ok button will be clicked
		  
		  String okexpectedtext="Hello Automation Testing user How are you today";
		  Thread.sleep(4000);
		String actual=  driver.findElement(By.id("demo1")).getText();
		
		if(okexpectedtext.equals(actual)){
			
			System.out.println("alert accepted");
		}

	}

}
