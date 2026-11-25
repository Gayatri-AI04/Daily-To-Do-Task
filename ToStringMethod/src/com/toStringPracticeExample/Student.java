package com.toStringPracticeExample;

public class Student {

	int sid;
	String sName;
	String sAdress;
	
	@Override
	public String toString() {
		
		return sid+" "+sName+" "+sAdress;
	}
}
