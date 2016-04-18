package org.thisKeywordusage;

public class CallingConstructor{  
    int id;  
    String name;  
    String city;  
      CallingConstructor obj1;
      //this keyword can be passed as argument in the method
      // argument in the constructor
      //return current class instance
   
      CallingConstructor(int id,String name){  
    this.id = id;  
    this.name = name; 
    // this();// throws error must be the first statement in a constructor
    display();//can access current class methods
    this.display();//no need to give this keyword here, compiler automatically adds "this"
    }  
  
      CallingConstructor(int id,String name,String city){  
    this(id,name);//now no need to initialize id and name  
    this.city=city;  
    }  
   
      void display(){System.out.println(id+" "+name+" "+city);}  
      
    public static void main(String args[]){  
    	CallingConstructor e1 = new CallingConstructor(111,"karan");  
    	CallingConstructor e2 = new CallingConstructor(222,"Aryan","delhi");  
    e1.display();  
    e2.display();  
   }  
}  