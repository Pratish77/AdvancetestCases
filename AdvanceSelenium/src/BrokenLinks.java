import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	

		public static void main(String[] args) throws InterruptedException, IOException {
			// TODO Auto-generated method stub

			// TODO Auto-generated method stub
					System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
					
					 WebDriver driver=new ChromeDriver();
					
					 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
					 
					 Thread.sleep(10000);
					 
					 List <WebElement> links=driver.findElements(By.tagName("a")); 
	
		
		             for(int i=0;i<links.size();i++) {
		            	 
		            	 //by using href attribute we can get url of required link
		            	 
		            	 WebElement element=links.get(i);
		            	 
		            	 String url= element.getAttribute("href");
		            	 
		            	 URL link=new URL(url);
		            	 
		            	 //create a connect using url objecct 'link'
		            	 
		            	 HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();
		            	 
		            	 Thread.sleep(2000);
		            	 //establish connection
		            	 httpconn.connect();
		            	 
		            	 int rescode=httpconn.getResponseCode();
		            	 
		            	 
		            	 if(rescode>=400)
		            	 {
		            		 System.out.println(url +" - "+"is broken link");
		            	 }else
		            	 {
		            		 System.out.println(url +" - "+"is valid link");
		            	 }
		             }
		}

}
