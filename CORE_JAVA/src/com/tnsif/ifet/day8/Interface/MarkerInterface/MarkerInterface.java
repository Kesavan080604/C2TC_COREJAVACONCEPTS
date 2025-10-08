package com.tnsif.ifet.day8.Interface.MarkerInterface;

public class MarkerInterface {
	public static void main(String[] args) {
		Student s=new Student(04,"KESAVAN",12000,"JAVA");
		if (s instanceof Registrable )
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");
			

	}

}