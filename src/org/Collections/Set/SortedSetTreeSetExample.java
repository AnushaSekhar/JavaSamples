package org.Collections.Set;

import java.util.*;  
public class SortedSetTreeSetExample{  
 public static void main(String args[]){  
   //set has unique values no duplicates
	 //maintains ascending order
	 //does not allow null
  TreeSet<String> al=new TreeSet<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  //al.add(null); throws null pointer exception
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  