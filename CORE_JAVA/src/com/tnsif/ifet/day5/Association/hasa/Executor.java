package com.tnsif.ifet.day5.Association.hasa;

public class Executor {
	public static void main(String[] args) {
		Address address = new Address("No:4,J.J.Nagar", "Villupuram", "Tamil Nadu",", 605401");
		Person person = new Person("Kesavan", address);
		person.displayInfo();
	}

}