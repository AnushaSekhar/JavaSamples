package org.InheritanceAndAggregation;

class SingleExample1{
	public void method1(){
		System.out.println("Method 1 of class 1");
	}
}
//single A--B(extends A)
//multilevel A--B(extends A)--C(extends B)
//hierarchical A, B extends A,C extends A
//Multiple A,B, C (extends A,B) not possible in java
//hybrid (hierarchical+Multiple)
class SingleExample2 extends SingleExample1{ //single inheritance Is-A relationship
	@Override//Method overriding 
	public void method1() {
		// TODO Auto-generated method stub
		super.method1();
	}
	  void method(SingleExample1 a) {
		  System.out.println("Instance of::"+(a instanceof SingleExample2));
		   // if(a instanceof SingleExample2){  Downcasting without using instanceOf
		    	SingleExample2 d=(SingleExample2)a;//downcasting  
		    	System.out.println("Downcating....");
		    	d.method1();
		   // }  
	   
	}  
	public static void main(String args[]){  
		SingleExample1 A=new SingleExample2();//upcasting variable
		   SingleExample2 obj=new SingleExample2();  
		   SingleExample1 obj1=new SingleExample2();  //upcasting parentclass refers to the object of child class
		  // SingleExample2 obj2=new SingleExample1();  //Downcasting throws error subclass refers to the object of parent class
		 //  SingleExample2 obj3=(SingleExample2) new SingleExample1();  //Downcating throws class cast exception
		
		 //  obj.method1();//Now which msg() method would be invoked? 
		   //obj3.method1();
		   obj.method(A);
		  
}
}

class Aggregation{ //Has-A relationship 
	//example
}

class AggExample1 extends Aggregation{//inheritace 
	
}
class AggExample2 {
	public static void main(String args[]){
		Aggregation agg=new Aggregation();//Aggregation example
		
	}
}
