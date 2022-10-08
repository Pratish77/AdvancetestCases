package Collections;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hashmap {
	
	
        static	HashMap <String,String> logindata(){
        	
        	HashMap<String, String> hm=new HashMap<String,String>();
        	
        	hm.put("X","mercury@mercury");
        	
        	hm.put("y","mercury@mercury1");
        	
        	hm.put("z","mercury@mercury2");
        	
        	
        	return hm;
        	
        }
        public static void main(String[]args) {
        	System.setProperty("webdriver.gecko.driver","C://Selenium docs//geckodriver-v0.31.0-win64//geckodriver.exe");
      	  
            WebDriver   driver=new FirefoxDriver();
            
            driver.get("https://demo.automationtesting.in/Register.html");
           
            String credentials=logindata().get("x");
            
            String [] arr=credentials.split("@");
            
            driver.findElement(By.name("username")).sendKeys(arr[0]);
            driver.findElement(By.name("username")).sendKeys(arr[1]);
            
       }
}
