package encodeDecode;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCasewithEncryptedpassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.facebook.com/");
		 
		 driver.findElement(By.name("email")).sendKeys("9966414466");
		 
		 driver.findElement(By.name("pass")).sendKeys(decodeString("UHJhdGlzaGt1bWFyQDc3"));
		 
		 driver.findElement(By.name("login")).click();
		 
		 String actual="Facebook";
		 
	}
	 static String decodeString(String password){
		 byte[] decodeString=Base64.decodeBase64(password);
		 return(new String(decodeString));
		
		
		
	}

}
