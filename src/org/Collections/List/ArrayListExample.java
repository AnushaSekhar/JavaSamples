package org.Collections.List;

import java.util.*;  
public class ArrayListExample{  
 public static void main(String args[]){  
   //Non synchronized
	 //Slow because of shifting values
	 
  ArrayList<String> al=new ArrayList<String>();//creating arraylist  
  //maintains the insertion order
  al.add("Ravi");//adding object in arraylist  
  al.add("Vijay");  
  al.add("check insertion order 3");
  al.add("Ravi");  //can contain duplicates
  al.add("Ajay"); 
  Collections.sort(al);
  Iterator itr=al.iterator();//getting Iterator from arraylist to traverse elements  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
  /// Add All method
  ArrayList<String> a2=new ArrayList<String>();
  a2.add("test 1");
  a2.add("test 2");
  al.addAll(a2);
  System.out.println("---Add All method Example---");
  for(String ex:al){//for each loop to iterate 
	  System.out.println(ex);
  }
  
  //Remove All method
 // al.removeAll(a2);
 // al.remove(2);//remove using Index
  System.out.println("---Remove All method Example---");
  for(String ex:al){//for each loop to iterate 
	  System.out.println(ex);
  }
  
  //RetainAll  method will lists the similar elements
  ArrayList<String> a3=new ArrayList<String>();
  a3.add("test 1");
  a3.add("test 2");
  a3.add("ravi");//case sensitive
  al.retainAll(a3);
  System.out.println("---Retain All method Example---");
  for(String ex:al){//for each loop to iterate 
	  System.out.println(ex);
  }
  
  System.out.println("---Sorted list---");
  for(String ex:al){//for each loop to iterate 
	  System.out.println(ex);
  }
  
  //Contains method checks the specified string is available in the list
  System.out.println("contains:"+ a3.contains("test 1"));
  
  //Clear method clears the elements
  a3.clear();
  System.out.println(a3.size());
  
 
 }  
}  