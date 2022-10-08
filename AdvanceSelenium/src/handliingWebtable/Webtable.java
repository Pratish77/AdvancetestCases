package handliingWebtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://Selenium docs//geckodriver-v0.31.0-win64//geckodriver.exe");
		  
		WebDriver driver=new FirefoxDriver();
		  
		 driver.get("file:///C:/Selenium%20docs/Htmltabletest.html");
		 
	     int rows =driver.findElements(By.xpath("html/body/table/tbody/tr")).size();
	     
	     int columns =driver.findElements(By.xpath("html/body/table/tbody/tr/th")).size();
		 
	     
		 System.out.println(rows);
		 
		 System.out.println(columns);
		 
		 int statuscount=0;
		 
		 for(int i=2;i<=rows;i++) {
			 
			//  for(int j=2;j<=columns;j++) 
				 
			 {
				String firstname= driver.findElement(By.xpath("html/body/table/tbody/tr[1]/th[3]")).getText();
				
				
				if(firstname.equals("Enki")) {
					
				}
				System.out.println("test passed");
			 }
		 }
		 
		 
		 
		 
	}

}
