import java.io.*;
import java.util.*;
class Box implements Comparable<Box>{
	private double l;
	private double w;
	private double h;
	Box(double l,double w,double h){
		this.l=l;
		this.w=w;
		this.h=h;
	}
	public double getVolume() {
		return this.l*this.w*this.h;
	}
	public int compareTo(Box b) {
		double v1 = b.l*b.h*b.w;
		double v2 = this.l*this.w*this.h;
		if(v2<v1)
			return -1;
		else if(v2>v1)
			return 1;
		else
			return 0;
	}
	public int hashCode() {
		double v = this.h*this.w*this.l;
		return String.valueOf(v).hashCode();
	}
	public boolean equals(Object obj) {
		Box b = (Box)obj;
		double v1 = b.l*b.h*b.w;
		double v2 = this.l*this.w*this.h;
		if(v2==v1)
			return true;
		else
			return false;
	}
	public String toString() {
		return "Length ="+this.l+" Width ="+this.w+" Height ="+this.h+" Volume ="+getVolume();
	}
}
public class M1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Set<Box> set = new TreeSet<>();
		System.out.println("Enter the number of Box");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++) {
			System.out.println("Enter the Box "+i+" details");
			System.out.println("Enter Length");
			double l = sc.nextDouble();
			System.out.println("Enter Width");
			double w = sc.nextDouble();
			System.out.println("Enter Height");
			double h = sc.nextDouble();
			Box b = new Box(l,w,h);
			set.add(b);
		}
		System.out.println("Unique Boxes in the Set are");
		Iterator<Box> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
