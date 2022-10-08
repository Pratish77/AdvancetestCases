package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlashingOrHighlightingElements {

	public static void flash(WebElement element,WebDriver driver) {
		// TODO Auto-generated method stub
		String bgcolor=element.getCssValue("backgrounfColor");//green

		for(int i=0;i<500;i++) {
			changeColor("#000000",element,driver);
			changeColor(bgcolor,element,driver);
		}
	}
	
    public static void changeColor(String color,WebElement element,WebDriver driver)
    {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
    	
    	try {
    		Thread.sleep(20);
    	}catch(InterruptedException e) {
    		
    	}
    }
    	public static void drawBorder(WebElement element,WebDriver driver) {
        	JavascriptExecutor js=(JavascriptExecutor)driver;
        	js.executeScript("arguments[0].style.border= '3px solid red'", element);
        }
    	
    	public static void clickElementbyjs(WebElement element,WebDriver driver) {
        	JavascriptExecutor js=(JavascriptExecutor)driver;
        	js.executeScript("arguments[0].click();", element);
        }//generate an alert
    	public static void generateAlert(String message,WebDriver driver) {
        	JavascriptExecutor js=(JavascriptExecutor)driver;
        	js.executeScript("alert('" +message+ "')");
        	
        	
        } 
    	
    	public static void refreshBrowserbyusingjs(WebDriver driver) {
        	JavascriptExecutor js=(JavascriptExecutor)driver;
        	js.executeScript("hystory.go(0)");
        } 
    	
    
}
