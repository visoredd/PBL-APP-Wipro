import java.util.*;
import java.io.*;
public class E2 {
	public static void main(String args[]) {
		 Map<String,String> M1 = new HashMap<String,String>(); 
	        M1.put("India", "Delhi"); 
	        M1.put("Japan", "Tokyo"); 
	        M1.put("Afganistan", "Kabul"); 
	        M1.put("Albania", "Albania"); 
	          
	        // using iterators 
	        System.out.println(M1.containsKey("India"));
	        System.out.println(M1.containsValue("India"));
	        Iterator<Map.Entry<String, String>> itr = M1.entrySet().iterator(); 
	          
	        while(itr.hasNext()) 
	        { 
	             Map.Entry<String, String> entry = itr.next(); 
	             System.out.println("Key = " + entry.getKey() +  
	                                 ", Value = " + entry.getValue()); 
	        } 
	}
}
