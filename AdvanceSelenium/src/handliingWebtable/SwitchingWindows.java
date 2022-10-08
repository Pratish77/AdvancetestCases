package handliingWebtable;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://demo.automationtesting.in/Windows.html");
		 
		 driver.findElement(By.xpath("//a[normalize-space()='Open New Tabbed Windows']")).click();
		 
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();
		 
		//System.out.println(driver.getTitle());
		 
		 Set <String> s=driver.getWindowHandles();//it returns the id/key value of the browser of the windows
		 
		 for(String i:s) {
			 
			 //System.out.println(i);//
			 String t=driver.switchTo().window(i).getTitle();
			 System.out.println(t);
			 
			 if(t.contains("Frames & windows")) {
				 
				 driver.close();

			 }
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
