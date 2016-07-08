package org.Examples;

import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.Statement;

public class TestDbConn extends DbConn {
	
	public Connection getConnection(){
		Statement stmt=null;
		DbConn dbCon=new DbConn();
		Connection connect = dbCon.getConnection();
		System.out.print("Connect:"+connect);
		return connect;
		   
	}

	
	
	public static void main(String[] args) {
		TestDbConn test=new TestDbConn();
		test.getConnection();
		}
}
