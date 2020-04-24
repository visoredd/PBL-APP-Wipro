package com.mile1.service;
import com.mile1.bean.*;
public class StudentService {
	public int findNumberOfNullMarks(Student data[]) {
		int len = data.length;
		int count =0;
		for(int i =0;i<len;i++) {
			if(data[i]!=null) {
			if(data[i].getMarks()==null) {
				count++;
			}
			}
		}
		return count;
	}
	
	public int findNumberOfNullNames(Student data[]) {
		int len = data.length;
		int count =0;
		for(int i =0;i<len;i++) {
			if(data[i]!=null) {
			if(data[i].getName()==null) {
				count++;
			}
			}
		}
		return count;
	}
	public int findNumberOfNullObjects(Student data[]) {
		int len = data.length;
		int count =0;
		for(int i =0;i<len;i++) {
			if(data[i]==null) {
				count++;
			}
			
		}
		return count;
	}
}