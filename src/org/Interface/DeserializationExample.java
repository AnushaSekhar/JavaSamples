package org.Interface;

import java.io.*;  
import java.util.List;
class DeserializationExample{  
 public static void main(String args[])throws Exception{  
    
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
 
  List<String> araylist =(List)in.readObject();
  //Student s=(Student)in.readObject();  
//  System.out.println(s.id+" "+s.name);  
  System.out.println("list size:"+araylist.size());
  for(String ex:araylist){
	  System.out.println("ex"+ex);
  }
  
  in.close();  
 }  
}  