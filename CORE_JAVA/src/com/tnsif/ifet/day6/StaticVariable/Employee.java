package com.tnsif.ifet.day6.StaticVariable;

public class Employee {
	private String name;
	private int id;

	static String companyName = "TNS-IF";

	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Company= "+companyName+"]";
	}

}