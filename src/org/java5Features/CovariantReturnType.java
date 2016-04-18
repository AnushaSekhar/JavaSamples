package org.java5Features;

class A{  
A get(){return this;}  //returns Class A instance
}  
  
class B1 extends A{  
B1 get(){return this;}  //returns class B instance
void message(){System.out.println("welcome to covariant return type");}  
  
public static void main(String args[]){  
new B1().get().message();  
}  
}  