package org.Threads;


public class TestThread extends Thread {

		 public void run(){  
		  for(int i=1;i<5;i++){  
		    try{
		      System.out.println("running thread name is:"+Thread.currentThread().getName());  
		    	Thread.sleep(10);
		    	
		    }
		    catch(InterruptedException e){
		    	System.out.println(e);
		   }  
		    System.out.println(i);  
		  }  
		 }  
		 public static void main(String args[]){  
			 TestThread t1=new TestThread();  
			 TestThread t2=new TestThread();  
		 t1.setPriority(MAX_PRIORITY);
		  t1.start();  
		  t1.setName("example");
		  
		/*  try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		  t2.setPriority(MIN_PRIORITY);
		  t2.start();  
		  t2.setName("SecondExample");
		  
		 }  
}
