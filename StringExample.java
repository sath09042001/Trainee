package com.chainsys.day5;

public class StringExample {

	public static void main(String[] args) {
		String Name="Sathish";
		System.out.println(Name);
		String LastName="kumar";
		String fullName=Name.concat(LastName);
		System.out.println(fullName);
		int i=Name.compareToIgnoreCase(Name);
		fullName.substring(i);
		System.out.println(i);
		

	}

}
