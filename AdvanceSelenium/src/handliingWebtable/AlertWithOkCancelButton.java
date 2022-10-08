package handliingWebtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOkCancelButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		
		 driver.get("https://demo.automationtesting.in/Alerts.html");
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();////p[@id='demo']
	
	    //switch to alert box
		 
		 Alert alert=driver.switchTo().alert();
		 
		  String alerttext=alert.getText();
		  
		  System.out.println(alerttext);
		 
		  alert.accept();//ok button will be clicked
		  
		  String okexpectedtext="You pressed Ok";
		  
		String actual=  driver.findElement(By.id("demo")).getText();
		
		if(okexpectedtext.equals(actual)){
			
			System.out.println("alert accepted");
		}
		Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		 
		 Thread.sleep(3000);

		 String cancelexpectedtext="You Pressed Cancel";

		 Thread.sleep(3000);
		 
         Alert alertcancel=driver.switchTo().alert();
		 
		 alert.dismiss();
		 
		 Thread.sleep(5000);
		 
		 String actualcanceltext=  driver.findElement(By.id("demo")).getText();
		 
		 Thread.sleep(3000);
		 
		 if(cancelexpectedtext.equals(actualcanceltext)) {
			 
			 System.out.println("alert accepted for dissmissal");
		 }
		 
	

	}

}
