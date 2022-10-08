import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	
	public static void main(String[]args) throws AWTException, InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
	
	    driver.findElement(By.xpath("")).click();
	    
	    Robot robot=new Robot();
	    
	    /*down arrow3 time tab key enter*/
	    
	    robot.keyPress(KeyEvent.VK_DOWN);//press down arrow in keyboard
	    Thread.sleep(3000);
	    robot.keyPress(KeyEvent.VK_TAB);
	    Thread.sleep(3000);
	    robot.keyPress(KeyEvent.VK_TAB);
	    Thread.sleep(3000);
	    robot.keyPress(KeyEvent.VK_TAB);
	    
	    Thread.sleep(3000);
	    
	    robot.keyPress(KeyEvent.VK_ENTER);
	    
	    Thread.sleep(3000);
	    }
}
