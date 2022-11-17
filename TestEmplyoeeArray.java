package com.chainsys.day5;
 import java.util.Scanner;
public class TestEmplyoeeArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Empolyee");
		int employee=sc.nextInt();
		
		EmployeeArray[]information=new EmployeeArray[employee];
		information[0]=new EmployeeArray(3331,"Sathish","cse",9348638798l);
		information[1]=new EmployeeArray(3332,"pravin","Mech",936874688l);
		information[2]=new EmployeeArray(3333,"vijay","Mca",987347432l);
		for(int i=0;i<information.length;i++) {
			System.out.println("Employee id:"+information[i].id);
			System.out.println("Employee name:"+information[i].name);
			System.out.println("Employee dept:"+information[i].dept);
			System.out.println("Employee contact:"+information[i].contactNo);
		}
	

	}
}
