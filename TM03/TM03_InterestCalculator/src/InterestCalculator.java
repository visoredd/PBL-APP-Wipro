import java.io.*;
import java.util.*;

abstract class Account{
	double interestRate;
	double amount;
	abstract double calculateInterest();
}

class FDAccount extends Account{
	private double interestRate;
	private double ammount;
	private int noOfDays;
	private int ageOfACHolder;
	FDAccount(double amm,int days,int age){
		this.ammount = amm;
		this.noOfDays = days;
		this.ageOfACHolder = age;
	}
	public double calculateInterest() {
		if(amount<10000000) {
			if(ageOfACHolder<60) {
				if(noOfDays>=7 && noOfDays <=14) {
					interestRate = 0.0450;
					return ammount*interestRate;
				}
				else if(noOfDays>=15 && noOfDays <=29) {
					interestRate = 0.0475;
					return ammount*interestRate;
				}
				else if(noOfDays>=30 && noOfDays <=44) {
					interestRate = 0.0550;
					return ammount*interestRate;
				}
				else if(noOfDays>=45 && noOfDays <=60) {
					interestRate = 0.0700;
					return ammount*interestRate;
				}
				else if(noOfDays>=61 && noOfDays <=184) {
					interestRate = 0.0750;
					return ammount*interestRate;
				}
				else if(noOfDays>=185 && noOfDays <=366) {
					interestRate = 0.0800;
					return ammount*interestRate;
				}
				else {
					interestRate = 0.0800;
					return ammount*interestRate;
				}
			}else {
				if(noOfDays>=7 && noOfDays <=14) {
					interestRate = 0.0500;
					return ammount*interestRate;
				}
				else if(noOfDays>=15 && noOfDays <=29) {
					interestRate = 0.0525;
					return ammount*interestRate;
				}
				else if(noOfDays>=30 && noOfDays <=44) {
					interestRate = 0.0600;
					return ammount*interestRate;
				}
				else if(noOfDays>=45 && noOfDays <=60) {
					interestRate = 0.0750;
					return ammount*interestRate;
				}
				else if(noOfDays>=61 && noOfDays <=184) {
					interestRate = 0.0800;
					return ammount*interestRate;
				}
				else if(noOfDays>=185 && noOfDays <=366) {
					interestRate = 0.0850;
					return ammount*interestRate;
				}
				else {
					interestRate = 0.0850;
					return ammount*interestRate;
				}
			}
		}
		else {
			if(noOfDays>=7 && noOfDays <=14) {
				interestRate = 0.0650;
				return ammount*interestRate;
			}
			else if(noOfDays>=15 && noOfDays <=29) {
				interestRate = 0.0675;
				return ammount*interestRate;
			}
			else if(noOfDays>=30 && noOfDays <=44) {
				interestRate = 0.0675;
				return ammount*interestRate;
			}
			else if(noOfDays>=45 && noOfDays <=60) {
				interestRate = 0.0800;
				return ammount*interestRate;
			}
			else if(noOfDays>=61 && noOfDays <=184) {
				interestRate = 0.0850;
				return ammount*interestRate;
			}
			else if(noOfDays>=185 && noOfDays <=366) {
				interestRate = 0.0100;
				return ammount*interestRate;
			}
			else {
				interestRate = 0.0100;
				return ammount*interestRate;
			}
		}
	}
}


class RDAccount extends Account{
	private double interestRate;
	private double ammount;
	private int noOfMonths;
	private int ageOfACHolder;
	private double monthlyAmmount;
	RDAccount(double amm,int days,int age){
		this.monthlyAmmount = amm;
		this.noOfMonths = days;
		this.ageOfACHolder = age;
	}
	public double calculateInterest() {
		ammount = monthlyAmmount*noOfMonths;
			if(ageOfACHolder<60) {
				if(noOfMonths>=6 && noOfMonths<9) {
					interestRate = 0.0750;
					return ammount*interestRate;
				}
				else if(noOfMonths>=9&& noOfMonths<12) {
					interestRate =0.0775;
					return ammount*interestRate;
				}
				else if(noOfMonths>=12 && noOfMonths<15) {
					interestRate = 0.0800;
					return ammount*interestRate;
				}
				else if(noOfMonths>=15 && noOfMonths<18) {
					interestRate = 0.0825;
					return ammount*interestRate;
				}
				else if(noOfMonths>=18 && noOfMonths<21 ) {
					interestRate = 0.0850;
					return ammount*interestRate;
				}
				else if(noOfMonths>=21) {
					interestRate = 0.0875;
					return ammount*interestRate;
				}
				else {
					interestRate = 0.0875;
					return ammount*interestRate;
				}
			}else {
				if(noOfMonths>=6 && noOfMonths<9) {
					interestRate = 0.0800;
					return ammount*interestRate;
				}
				else if(noOfMonths>=9 && noOfMonths<12) {
					interestRate = 0.0825;
					return ammount*interestRate;
				}
				else if(noOfMonths>=12 && noOfMonths<15) {
					interestRate = 0.0850;
					return ammount*interestRate;
				}
				else if(noOfMonths>=15 && noOfMonths<18) {
					interestRate = 0.0875;
					return ammount*interestRate;
				}
				else if(noOfMonths>=18 && noOfMonths<21) {
					interestRate = 0.0900;
					return ammount*interestRate;
				}
				else if(noOfMonths>=21) {
					interestRate = 0.0925;
					return ammount*interestRate;
				}
				else {
					interestRate = 0.0925;
					return ammount*interestRate;
				}
			}
	}
}

class SBAccount extends Account{
	private double interestrate;
	private double ammount;
	SBAccount(double ammount) {
		this.ammount = ammount;
	}
	public double calculateInterest() {
		interestrate = 0.04;
		return ammount*interestrate;
	}
}


public class InterestCalculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int opt;
		do {
			System.out.println("MAIN MENU");
			System.out.println("---------");
			System.out.println("\t1.  Interest Calculator -SB");
			System.out.println("\t2.  Interest Calculator -FD");
			System.out.println("\t3.  Interest Calculator -RD");
			System.out.println("\t4.  Exit");
			System.out.print("Enter your option (1..4): ");
			opt = sc.nextInt();
			try {
				switch(opt) {
				case 1:
					System.out.print("Enter the Average amount in your account: ");
					double a = sc.nextDouble();
					if(a<0)
						throw new NegativeValueException();
					SBAccount sb = new SBAccount(a);
					System.out.println("Interes gained: Rs. "+sb.calculateInterest());
					break;
				case 2:
					System.out.print("Enter the FD Amount: ");
					double fa = sc.nextDouble();
					if(fa<0)
						throw new NegativeValueException();
					System.out.print("Enter the number of days: ");
					int d = sc.nextInt();
					if(d<0)
						throw new NegativeValueException();
					System.out.print("Enter your age: ");
					int ag = sc.nextInt();
					if(ag<0)
						throw new NegativeValueException();
					FDAccount fd = new FDAccount(fa,d,ag);
					System.out.println("Interest gained is: Rs. "+fd.calculateInterest());
					break;
				case 3:
					System.out.print("Enter Monthly Amount: ");
					double ra = sc.nextDouble();
					if(ra<0)
						throw new NegativeValueException();
					System.out.print("Enter the number of months: ");
					int rm = sc.nextInt();
					if(rm<0)
						throw new NegativeValueException();
					System.out.print("Enter your age: ");
					int rag = sc.nextInt();
					if(rag<0)
						throw new NegativeValueException();
					RDAccount rd = new RDAccount(ra,rm,rag);
					System.out.println("Interest gained is: Rs. "+rd.calculateInterest());
					break;
				case 4:
					System.out.println("Exitting...!!");
					System.exit(1);
					break;
				}
			}
			catch(NegativeValueException e) {
				System.out.println(e.getMessage());
			}
		}while(opt!=4);
	}
}
