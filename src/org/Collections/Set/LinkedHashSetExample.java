package org.Collections.Set;

import java.util.*;  
public class LinkedHashSetExample{  
 public static void main(String args[]){  
	 //set has unique values no duplicates
	   //Allows having single null values
	 //Null value position matters
  LinkedHashSet<String> al=new LinkedHashSet<String>();  
  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi"); 
  al.add(null);
  al.add("Ajay");  
  al.add(null);
  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  