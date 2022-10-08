package headLeassBrowser;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessHtmlUnitDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HtmlUnitDriver driver=new HtmlUnitDriver();
		  
		driver.get("https://www.facebook.com");
		 
		String expected=driver.getTitle();
		  
			 System.out.println(expected);
			 System.out.println(driver.getCurrentUrl());
			 

	}

}
