package com.tnsif.ifet.day7.Overriding;

public class Overriding {
	public static void main(String[] args) {
		RBI rbi;

//		Dynamic binding assigning child class object to parent class reference variable.
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());

		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterest());

		rbi = new RBI();
		System.out.println(rbi.getRateOfInterest());

	}

}