package org.test;

public class TestingInheritance{
	
	public static void main(String args[]){
		
	}
	public class TestA1{
		int A=10;
		public void paintMessage(String msg){
			System.out.println("paint:"+msg);
		}
		
	}
	public class TestA2 extends TestA1{
		TestA1.paintMessage("example1");
	}
	
	public class TestA3{
		
	}
}
