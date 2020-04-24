package com.automobile.fourwheeler;
import com.automobile.*;
public class Logan extends Vehicle{
	private String modelName;
	private String regisName;
	private String OwnerName;
	private int speed;
	public Logan(String modelName,String regisName,String OwnerName,int speed){
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
	public void gps() {
		System.out.println("provides facility to control the gps device");
	}
}
