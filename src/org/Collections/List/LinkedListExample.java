import java.util.*;  
public class LinkedListExample{  
 public static void main(String args[]){  
	 /*
	  * Java LinkedList class uses doubly linked list to store the elements. It extends the AbstractList class and implements List and Deque interfaces.
		Java LinkedList class can contain duplicate elements.
		Java LinkedList class maintains insertion order.
		Java LinkedList class is non synchronized.
		In Java LinkedList class, manipulation is fast because no shifting needs to be occurred.
		Java LinkedList class can be used as list, stack or queue.
	  */
   
  LinkedList<String> al=new LinkedList<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  Collections.sort(al);
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  