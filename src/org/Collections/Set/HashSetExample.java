package org.Collections.Set;

import java.util.*;  
public class HashSetExample{  
 public static void main(String args[]){  
   //set has unique values no duplicates
   //Allows having single null values
	 //null always in first position
  HashSet<String> al=new HashSet<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  al.add(null);
  al.add(null);
  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  