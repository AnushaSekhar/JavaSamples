import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PropertyDuplicateCheck {

 /**
  * @param args
  */
 public static void main(String[] args) {
  FileInputStream fis = null;
  String EQUALs = "=";
  try {
   fis = new  FileInputStream("C:\\tomcat\\webapps\\eyrevenueplus\\WEB-INF\\classes\\resources\\bundle.properties");

   Set<String> set = new TreeSet<String>();
   Map<String, Integer> map = new TreeMap<String, Integer>();

   BufferedReader br = new BufferedReader(new InputStreamReader(fis));
   String strLine;
   String keyValuePair[] = null;
   System.out.println("Unparsed or commented Lines:");
   while ((strLine = br.readLine()) != null) {
    if (strLine.contains(EQUALs)) {
     keyValuePair = strLine.split(EQUALs);
     String key = keyValuePair[0];

     if (!set.add(key)) {
      if (map.containsKey(key)) {
       map.put(key, map.get(key).intValue() + 1);
      } else {
       map.put(key, 2);
      }
     }

    } else {
     System.out.println(strLine);
    }
   }

   String duplicates = map.toString();
System.out.println("Printing Duplicates");
for(String str : duplicates.split(",")){
	 System.out.println(str);
}


  } catch (Exception e) {
   System.err.println("Error: " + e.getMessage());
  } finally {
   try {
    fis.close();
   } catch (Exception e) {
    // do nothing
   }
  }

 }

}