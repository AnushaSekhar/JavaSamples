package org.Interface;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

class SearlizationExample{  
 public static void main(String args[])throws Exception{  
  Student s1 =new Student(211,"ravi");  
  
  List ex=new ArrayList();
  ex.add("one");
  ex.add("two");
  
  /*FileOutputStream fout=new FileOutputStream("f.txt");  
  ObjectOutputStream out=new ObjectOutputStream(fout);  
  
  out.writeObject(ex);  
  out.flush();  
  System.out.println("success");  */
  
  String chr="madam";
  String reverse="";
  int len=chr.length();
  System.out.println("len:"+len);
    for(int i=len-1;i>-1;i--)
  {
    	System.out.println("i"+i+"--"+chr.charAt(i));
  reverse=reverse+chr.charAt(i);
  }
  System.out.println("Reversed String is: "+reverse);

  if(chr.equals(reverse))
  {
  System.out.println("The Given String is Palindrome");
  }else{
           System.out.println("The Given String is not a Palindrome");
  }
 }  
}  