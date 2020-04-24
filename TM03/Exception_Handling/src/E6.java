import java.util.*;
import java.io.*;

class NegativeValueException extends Exception{
	public void NegativeValueException(){
		System.out.println("Negative Value Exception");
	}
}
class OutOfRangeException extends Exception{
	public void OutOfRangeException(){
		System.out.println("Out of Range Exception");
	}
}

public class E6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i =2;
		while(i-->0) {
			try {
				System.out.println("Enter Subject Marks of Student"+i+": ");
				String sub1 = sc.next();
				int s1 = Integer.parseInt(sub1);
				if(s1<0)
					throw new NegativeValueException();
				if(s1>100)
					throw new OutOfRangeException();

				String sub2 = sc.next();
				int s2 = Integer.parseInt(sub2);
				if(s2<0)
					throw new NegativeValueException();
				if(s2>100)
					throw new OutOfRangeException();

				String sub3 = sc.next();
				int s3 = Integer.parseInt(sub3);
				if(s3<0)
					throw new NegativeValueException();
				if(s3>100)
					throw new OutOfRangeException();

				System.out.println("Subject A: "+s1);
				System.out.println("Subject B: "+s2);
				System.out.println("Subject C: "+s3);
				System.out.println("Average: "+ (s1+s2+s3)/3);
			}
			catch(NumberFormatException e) {
				System.out.println(e);
			}
			catch(NegativeValueException n) {
				n.NegativeValueException();;
			}
			catch(OutOfRangeException o) {
				o.OutOfRangeException();;
			}
		}
	}
}
