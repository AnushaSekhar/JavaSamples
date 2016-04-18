package org.thisKeywordusage;

public class CurrentClassInstance{  
    int id;  
    String name;  
    
   /* CurrentClassInstance(int id,String name){  
    	  //here ambiguity occurs since parameter and instance variables are same ..
        //can be resolved by using this keyword or can use different parameters name
   // id = id;  
    //name = name;
    	//Using this keyword 
    	this.id=id;
    	this.name=name;
    } */
    CurrentClassInstance(int i,String j){  
     id = i;  
     name = j;
  } 
    void display(){System.out.println(id+" "+name);}  
  
    public static void main(String args[]){  
    CurrentClassInstance s1 = new CurrentClassInstance(111,"Karan");  
   	CurrentClassInstance s2 = new CurrentClassInstance(321,"Aryan");  
    s1.display();  
    s2.display();  
    }  
}  