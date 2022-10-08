package handliingWebtable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.bcel.generic.NEWARRAY;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropdownSortedOptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");//opens the URL

	WebElement element=	 driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[2]/div[19]/select[1]"));
		 Select dropdown=new Select(element);
		 
		 Thread.sleep(5000);
		
		 dropdown.selectByVisibleText("Evening");
		 List actuallist=new ArrayList();
		 
		 List templist=new ArrayList();
		 
		 List <WebElement>options=dropdown.getOptions();
		 for(WebElement e:options) {
			 actuallist.add(e.getText());
			 templist.add(e.getText());
		 }
		 System.out.println(actuallist); 
		 
		 //List templist=new ArrayList();
		 
		// templist=actuallist; 
		 
		 System.out.println(templist);
		 
		 Collections.sort(templist);
		 
		 System.out.println(templist);
		 System.out.println(actuallist);
		 
		 if(actuallist==templist) {
			 System.out.println("dropdown sorted");
		 }else
		 {
			 System.out.println("dropdown not sorted"); 
		 }
		// driver.close();
		 
	}

}
