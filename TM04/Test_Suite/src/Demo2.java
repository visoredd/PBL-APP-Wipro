
public class Demo2 {
	 public boolean palindromeCheck(String str) {
		 StringBuffer sb = new StringBuffer();
		 sb.append(str);
		 sb.reverse();
		 return str.contentEquals(sb.toString());
	 }
}
