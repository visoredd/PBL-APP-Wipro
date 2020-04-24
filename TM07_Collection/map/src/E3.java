import java.io.*;
import java.util.*;
class Properties{
	HashMap<String,String> M1 = new HashMap<>();
	Properties(){
		M1.put("Haryana","Chandigarh");
		M1.put("Rajasthan","Jaipur");
		M1.put("Punjab","Punjab");
		M1.put("Uttar Pradesh","Lucknow");
	}
}

public class E3 {
	public static void main(String args[]) {
		Properties p = new Properties();
		Iterator<Map.Entry<String, String>> itr = p.M1.entrySet().iterator(); 
        
        while(itr.hasNext()) 
        { 
             Map.Entry<String, String> entry = itr.next(); 
             System.out.println("State = " + entry.getKey() +  
                                 ", Capital = " + entry.getValue()); 
        } 
	}
}
