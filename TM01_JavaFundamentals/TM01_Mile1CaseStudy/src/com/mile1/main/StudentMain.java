package com.mile1.main;
import com.mile1.bean.*;
import com.mile1.exception.*;
import com.mile1.service.*;
import java.io.*;
import java.util.*;
public class StudentMain {
	static Student data[] = new Student[4];
	static {
		for(int i=0;i<data.length;i++) {
			data[0] = new Student("Sekar",new int[] {35,35,35});
			data[1] = new Student(null,new int[] {11,22,33});
			data[2] = null;
			data[3] = new Student("Manoj",null);
		}
	}
	public static void main(String args[])throws NullStudentException,NullNameException,NullMarksArrayException{
		StudentReport sr = new StudentReport();
		String x = null;
		for(int j =0;j<data.length;j++) {
			try{
				x = sr.validate(data[j]);
			}catch(NullNameException e) {
				x = e.toString();
			}catch(NullMarksArrayException e) {
				x = e.toString();
			}catch(NullStudentException e) {
				x = e.toString();
			}
			System.out.println("GRADE: "+x);
		}
		StudentService ss = new StudentService();
		System.out.println("Number of Objects with Marks array as null = "+ss.findNumberOfNullMarks(data));
		System.out.println("Number of Objects with Name as null = "+ss.findNumberOfNullNames(data));
		System.out.println("Number of Objects that are entirely null = "+ss.findNumberOfNullObjects(data));
	}
}
