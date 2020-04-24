package com.automobile.twowheeler;

import  com.automobile.Vehicle;

public class Honda extends Vehicle {
	private String modelName;
	private String regisName;
	private String OwnerName;
	private int speed;
	public Honda(String modelName,String regisName,String OwnerName,int speed){
		this.modelName = modelName;
		this.regisName = regisName;
		this.OwnerName = OwnerName;
		this.speed = speed;
	}
	public String getModelName() {
		return modelName;
	}
	public String getRegistrationNumber() {
		return regisName;
	}
	public String getOwnerName() {
		return OwnerName;
	}
	public int getSpeed() {
		return speed;
	}
	public void cdplayer() {
		System.out.println("Provides facility to control the cd player device which is available in the car. ");
	}
	
}
