package com.ParameterConstructor;

public class Student {

	int id;
	String name;
	String Adress;
	
	
	Student(){
		System.out.println("---Default constructor----");
		
	}
	
	Student(int i){
		System.out.println("--Single Parameter Constructor--");
		System.out.println(i);
	}
	
	Student(String a, char n, boolean flag){
		System.out.println("--Three parameter constructor--");
		System.out.println(a+" "+ n +" "+flag);
	}
	
	Student(int stdId, String stdName, String stdAdress){
		id = stdId;
		name = stdName;
		Adress = stdAdress;
		
	}
	
//	public static void main(String[] args) {
//		
//		Student std = new Student();
//		Student s1 = new Student(890);
//		Student s2 = new Student("hsgdj", 'B', true);
//		
//		
//		
//	}
//	
	
	
	
	
	
	
}
