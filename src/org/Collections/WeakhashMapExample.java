package org.Collections.Map;

import java.util.*;

public class WeakhashMapExample {
   private static Map map;
   public static void main (String args[]) {
      map = new WeakHashMap();
      String anus=new String("Anusha");
      map.put(new String("Maine"), "Augusta");
      map.put(anus, "Anusha");
      System.out.println("Thread waiting"+map.size());
      System.gc();//this will remove weak references key in Map
      System.out.println(" After Thread waiting--"+map.get("Maine")+"---"+map.get("Anusha"));
   
      Map map1=new HashMap<>();
      map1.put(new String("Maine"), "Augusta");
      map1.put(anus,"Anusha");
      System.gc();// weak references in key are not removed in HashMap
      System.out.println(" After Thread waiting--"+map1.get("Maine")+"---"+map1.get("Anusha"));
   
   }
}