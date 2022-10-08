package handliingWebtable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://Selenium docs//geckodriver-v0.31.0-win64//geckodriver.exe");
		  
		WebDriver driver=new FirefoxDriver();
		
		//click on calender picker
		
		driver.findElement(By.xpath("")).click();
		
		Select selectyear=new Select(driver.findElement(By.xpath("")));
		selectyear.selectByVisibleText("2017");
		for(int i=6;i>=1;i--) {
			
			driver.findElement(By.xpath("")).click();
			String month=driver.findElement(By.xpath("")).getText();
			if(month.equals("October")) {
				driver.findElement(By.linkText("20")).click();
				break;
				
			}
		}
		
		
	}

}
