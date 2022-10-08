 package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.bcel.generic.Select;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReadingDatafromtheexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebElement driver = null;
		
		//getting data from excel sheet

		FileInputStream file=new FileInputStream("C://Selenium docs//readingData.xlsx");
	
		//get the workbook instance for the
	    XSSFWorkbook workbook=new XSSFWorkbook(file);
	    
	    //get first sheet from the sheet
	    
	    XSSFSheet sheet=workbook.getSheet("Sheet1");//providing sheet name
	    
	   // XSSFSheet sheet1=workbook.getSheetAt(0);//providing sheet index index starts with '0'
	   //get first row from the sheet 
	   int rowcount=sheet.getLastRowNum();//returns the row count
	    
	   int columncount=sheet.getRow(0).getLastCellNum();
	   
	   System.out.println("No of records in the excel sheet:"+rowcount);
	   
	   for(int i=0;i<rowcount;i++)
	   {
		  XSSFRow currentrow= sheet.getRow(i);
		  
		  String Emp_id=currentrow.getCell(0).getStringCellValue();
				  
		  String First_Name=currentrow.getCell(1).getStringCellValue();
		  
		  String Last_name=currentrow.getCell(2).getStringCellValue();
		  
		  String Salary=currentrow.getCell(3).getStringCellValue();
		  
		  //Employ enrollment
		  
		  driver.findElement(By.linkText("EnrolEmploy")).click();
		  
		  //Entering contact information
		  
		  driver.findElement(By.name("empid")).sendKeys(Emp_id);
		  
		  driver.findElement(By.name("firstname")).sendKeys(First_Name);
		  
		  driver.findElement(By.name("lastname")).sendKeys(Last_name);
		  
		  driver.findElement(By.name("salary")).sendKeys(Salary);
		  
		  driver.findElements(By.name("enroll"));
		  
		 /* if(driver.getPageSourse().contains("Thank you for register")) {
			  
			  System.out.println("user sucessfully enrolled");
		  }
		  else {
			  System.out.println("user not sucessfully enrolled");
		  }
		  
		  
		  
		  /*for(int j=0;j<columncount;j++)
		  {
			 String tablevalues= currentrow.getCell(j).toString();
			 System.out.print("   "+tablevalues);
		  }
		  System.out.println();*/
	   }
	    
	    
	    
	    
	
	
	
	}

}
