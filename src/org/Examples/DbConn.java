package org.Examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbConn {
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:sqlserver://localhost;databaseName=Employee;integratedSecurity=false";

	   //  Database credentials
	   static final String USER = "sa";
	   static final String PASS = "Anusha@123";
	   
	   public Connection getConnection(){
		   Connection conn = null;
		   Statement stmt = null;
		   try{
		   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	       conn = DriverManager.getConnection(DB_URL,USER,PASS);
		   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }finally{
			   }
		return conn;
	   }
	   
	 
}
