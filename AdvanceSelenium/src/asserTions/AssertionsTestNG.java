package asserTions;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertionsTestNG {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@Test
		void assertTest() {
			
		Assert.assertTrue(true);	//
		
		Assert.assertEquals("welcome","welcome");
		
		Assert.assertEquals("selenium","selenium");
		
		System.out.println("successfully passed!");
		
		
	}
   }