import java.io.*;
import java.util.*;
public class E4 {
	public static void main(String args[]) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(1);
		list.add(2.3);
		list.add("Shivam");
		boolean flag = false;
		for(int i=0;i<list.size();i++) {
			Object o = list.get(i);
			if(o instanceof Integer || o instanceof Float||o instanceof Double) {
				flag = true;
			}
			else {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println(list);
		}
		else {
			System.out.println("Only Integer, Float, and Double are supported");
		}
	}
}
