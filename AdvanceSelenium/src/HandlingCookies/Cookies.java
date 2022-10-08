package HandlingCookies;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 //Thread.sleep(10000);
	
	   // Set<Cookie>   cookies=driver.manage().getCookies();
	    
	    
	   // System.out.println("Size of cookies:"+cookies.size());
	    
	   /* for(Cookie c:cookies) {
	    	
	    	System.out.println(c.getName()+":"+c.getValue());//read and print all the cookies
	    	
	    	}
	    //it prints specific cookie according to the name
	    System.out.println(driver.manage().getCookieNamed("orangehrm"));
	   */
	    Cookie cobj=new Cookie("mycookie", "12345466");
	    
	    driver.manage().addCookie(cobj);
	    
	    //added cookies check
	    
	    Set<Cookie>   cookies=driver.manage().getCookies();
	    
	    System.out.println("Size of cookies:"+cookies.size());
	    
        for(Cookie c:cookies) {
	    	
	    System.out.println(c.getName()+":"+c.getValue());//read and print all the cookies
	    	
	    }
        driver.manage().deleteCookie(cobj);
        
        Set<Cookie>   cookies1=driver.manage().getCookies();
	    
	    System.out.println("Size of cookies:"+cookies1.size());
	    
	    driver.manage().deleteAllCookies();
	    
	    cookies1=driver.manage().getCookies();
	    
	    System.out.println("Size of cookies:"+cookies1.size());
	    
	      }
	}
