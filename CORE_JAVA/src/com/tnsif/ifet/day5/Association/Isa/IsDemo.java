package com.tnsif.ifet.day5.Association.Isa;

public class IsDemo {
	public static void main(String[] args) {

		Employee employee = new Employee("Kesavan", 04, "AI&DS");
		Manager manager = new Manager("Kesavan", 4, "Hr", 44);

		System.out.println(employee);
		System.out.println("---------------------------------------------------------------");
		System.out.println(manager);
	}

}