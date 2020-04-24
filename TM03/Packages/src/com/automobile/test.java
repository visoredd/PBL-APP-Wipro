package com.automobile;
import com.automobile.twowheeler.*;
import com.automobile.fourwheeler.*;
public class test{
	public static void main(String args[]) {
		Hero hero = new Hero("Splender", "HR16G1234", "Boby Singh",60);
		System.out.println(hero.getModelName());
		System.out.println(hero.getOwnerName());
		System.out.println(hero.getRegistrationNumber());
		System.out.println(hero.getSpeed());
		hero.radio();
		System.out.println();
		System.out.println();
		Honda honda = new Honda("Honda City", "HR18G7777", "Raj Chaudhary", 110);
		System.out.println(honda.getModelName());
		System.out.println(honda.getOwnerName());
		System.out.println(honda.getRegistrationNumber());
		System.out.println(honda.getSpeed());
		honda.cdplayer();
		System.out.println();
		System.out.println();
		Logan logan = new Logan("Dacia Logan", "HR09A9777", "Vishu Saini", 100);
		System.out.println(logan.getModelName());
		System.out.println(logan.getOwnerName());
		System.out.println(logan.getRegistrationNumber());
		System.out.println(logan.getSpeed());
		logan.gps();
		System.out.println();
		System.out.println();
		Ford ford = new Ford("Mustand", "HR11W0936", "Bunty Chaudhary", 125);
		System.out.println(ford.getModelName());
		System.out.println(ford.getOwnerName());
		System.out.println(ford.getRegistrationNumber());
		System.out.println(ford.getSpeed());
		ford.tempControl();
		
	}
}