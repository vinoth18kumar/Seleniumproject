package co.edureka.selenium.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectionExample {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");   
   
   
   Connection connection = DriverManager.
		   getConnection("jdbc:sqlserver://vinot@192.168.225.84/vinothDB");
   System.out.println("connected");
   Statement statement=  connection.createStatement();
   ResultSet Result= statement.executeQuery("Select * From Details");
   
   while(Result.next()) {
	   
	  System.out.println(Result.getString(1));
	  	  
   }
	      
   	} 

}
