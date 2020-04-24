package com.mile1.service;
import com.mile1.bean.*;
import com.mile1.exception.*;
public class StudentReport {
	public String findGrade(Student st) {
		String result="";
		int[] marks = st.getMarks();
		if(marks[0]<35 && marks[1]<35 && marks[2]<35) {
			result = "F";
		}
		else {
			if(marks[0]+marks[1]+marks[2]<=150) {
				result = "D";
			}
			else if(marks[0]+marks[1]+marks[2]<=200) {
				result = "C";
			}
			else if(marks[0]+marks[1]+marks[2]<=250) {
				result = "B";
			}
			else if(marks[0]+marks[1]+marks[2]<=150) {
				result = "A";
			}
		}
		return result;
	}
	
	public String validate(Student st) throws NullStudentException,NullNameException,NullMarksArrayException{
		if(st==null) {
			NullStudentException nse = new NullStudentException();
			return nse.toString();
		}else {
			if(st.getName()==null) {
				NullNameException nne = new NullNameException();
				return nne.toString();
			}
			if(st.getMarks()==null) {
				NullMarksArrayException nmae = new NullMarksArrayException();
				return nmae.toString();
			}
			return findGrade(st);
		}
	}
}
