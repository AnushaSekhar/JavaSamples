package org.Examples.Threads;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.Examples.TestDbConn;

class  SingleThread extends Thread {	
	public void run(StringBuilder sloutput){
		System.out.print("Single thread is running:");
		TestDbConn conn=new TestDbConn();
		Connection connect=conn.getConnection();
		Statement stmt=null;
		String name,company="";
		int id,salary=0;
		
		try {
			stmt=connect.createStatement();
			String sql="Select ID,NAME,SALARY,COMPANY from emploee_details";
			
			ResultSet rs=null;
			rs=stmt.executeQuery(sql);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while(rs.next()){
				company=rs.getString("COMPANY");
				name=rs.getString("NAME");
				id=rs.getInt("ID");
				salary=rs.getInt("SALARY");
				sloutput.append("NAME:"+name+" COMAPNY:"+company+" SALARY:"+salary);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	/**
	 * @param args
	 */
	class SecondThread extends Thread {
	
		public void run(StringBuilder sloutput){
			System.out.print("Single thread is running:");
			TestDbConn conn=new TestDbConn();
			Connection connect=conn.getConnection();
			Statement stmt=null;
			String name,address="";
			int id,salary=0;
			
			try {
				stmt=connect.createStatement();
				String sql="Select * from address";
				
				ResultSet rs=null;
				rs=stmt.executeQuery(sql);
				while(rs.next()){
					address=rs.getString("ADDRESS");
					name=rs.getString("NAME");
					sloutput.append(" NAME:"+name+" ADDRESS:"+address);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sloutput=new StringBuilder();
		SingleThread sigT=new SingleThread();
		SecondThread sig2T =new SecondThread();
		sigT.start();
		sig2T.start();
		sigT.run(sloutput);
		sig2T.run(sloutput);
		System.out.println("StringBuilder :"+sloutput.toString());
	}
	}


