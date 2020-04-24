import java.io.*;
import java.util.*;

abstract class GeneralBank{
	abstract void getSavingInterestRate();
	abstract void getFixedDepositInterestRate();
}

class ICICIBank extends GeneralBank{
	void getSavingInterestRate() {
		System.out.println("Saving Interest Rate of ICICIBank is '4%'");
	}
	void getFixedDepositInterestRate() {
		System.out.println("Fixed Deposit Interest Rate of ICICIBank is '8.5%'");
	}
}

class KotMBank extends GeneralBank{
	void getSavingInterestRate() {
		System.out.println("Saving Interest Rate of KotMBank is '6%'");
	}
	void getFixedDepositInterestRate() {
		System.out.println("Fixed Deposit Interest Rate of KotMBank is '9%'");
	}
}

public class E1 {
	public static void main(String args[]) {
		GeneralBank gb;
		ICICIBank ib = new ICICIBank();
		KotMBank km = new KotMBank();
		gb=ib;
		gb.getSavingInterestRate();
		gb.getFixedDepositInterestRate();
		gb=km;
		gb.getSavingInterestRate();
		gb.getFixedDepositInterestRate();
	}
}
