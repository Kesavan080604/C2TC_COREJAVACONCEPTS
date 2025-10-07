package com.tnsif.ifet.day6.StaticVariable;

public class EmployeeDemo {
	public static void main(String[] args) {

		System.out.println(Employee.companyName);
		Employee e = new Employee("Kesavan", 04);
		System.out.println(e);

		e = new Employee("Ashwin", 03);
		System.out.println(e);
	}
}