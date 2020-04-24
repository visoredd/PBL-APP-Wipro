import java.io.*;
import java.util.*;

class Card{
	String symbol;
	int number;
	public void setSymbol(String s) {
		this.symbol = s;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setNumber(int n) {
		this.number = n;
	}
	public int getNumber() {
		return number;
	}
	public String toString() {
		return this.symbol+" "+this.number;
	}
}

public class M1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		TreeMap<String,ArrayList<Card>> map = new TreeMap<>();
		System.out.println("Enter Number of Cards: ");
		int n = sc.nextInt();
		for(int i =1;i<=n;i++) {
			System.out.println("Enter card "+i+":");
			Card c = new Card();
			c.setSymbol(sc.next());
			c.setNumber(sc.nextInt());
			if(map.containsKey(c.getSymbol())) {
				ArrayList<Card> list = map.get(c.getSymbol());
				list.add(c);
				map.put(c.getSymbol(), list);
			}
			else {
				ArrayList<Card> list = new ArrayList<>();
				list.add(c);
				map.put(c.getSymbol(), list);
			}
		}
		System.out.println("Distinct Symbols are :");
		for(Map.Entry<String,ArrayList<Card>> entry: map.entrySet()) {
			System.out.print(entry.getKey()+" ");
		}
		System.out.println();
		for(Map.Entry<String,ArrayList<Card>> entry: map.entrySet()) {
			System.out.println("Cards in "+entry.getKey()+" Symbol");
			int sum =0;
			for(int j=0;j<entry.getValue().size();j++) {
				System.out.println(entry.getValue().get(j));
				sum+=entry.getValue().get(j).getNumber();
			}
			System.out.println("Number of cards : "+entry.getValue().size());
			System.out.println("Sum of Numbers : "+sum);
		}
	}
}
