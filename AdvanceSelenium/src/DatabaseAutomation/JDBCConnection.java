package DatabaseAutomation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		//step1
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborc1","hr","hr");
		
		//step2
		Statement stmt=con.createStatement();
		
		//step3:execute sql statement
		String s="insert into users values(102,'mercury2','mercury2')";
		stmt.executeQuery(s);
		
		//step4
		
		con.close();
		
		System.out.println("test is done");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
