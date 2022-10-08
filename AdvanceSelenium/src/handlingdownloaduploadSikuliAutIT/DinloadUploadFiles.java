package handlingdownloaduploadSikuliAutIT;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DinloadUploadFiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		
		 driver.get("https://demo.automationtesting.in/FileDownload.html");
		 
		 Thread.sleep(3000);

		 driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("TesterAutoma");
		 
		 Thread.sleep(6000);
		 
		 driver.findElement(By.id("createTxt")).click();
		 
		 if(isFileExist("\"C:\\Users\\Pratish Dama\\Downloads\\Form_pdf_339508290310722.pdf\"")) {
			 
			System.out.println("file exists"); 
			 
		 }else {
			 
			 System.out.println("file not found");
		 }
		 
		 
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]")).click();
		 
		 driver.findElement(By.xpath("//textarea[@id='pdfbox']")).sendKeys("TesterAutoma");
		 
		 driver.findElement(By.xpath("//button[@id='createPdf']")).click();
		 
		 driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[2]/a[1]")).click();
		 
		 }
	String location="c:\\donloads\\";
        static boolean isFileExist(String path){
        	
        	File f=new File(path);
			if(f.exists()) {
				return true;
			}else
			{
				return false;
			}
         }
}
