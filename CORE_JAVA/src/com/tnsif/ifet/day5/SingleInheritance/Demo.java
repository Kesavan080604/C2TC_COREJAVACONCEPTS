package com.tnsif.ifet.day5.SingleInheritance;

public class Demo {
public static void main(String[] args) {
		
		Citizen c = new Citizen("Kesavan", "258741962525", "Chennai", 9159186845L);
		System.out.println(c);
		
		Student student = new Student("Ashwin", "8080808080", "Villupuram", 9888878787L, 10, "IFET College");
		System.out.println(student);
	}

}