package com.chainsys.day5;
import java.util.Scanner;

public class TestStudentArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number of Students ");
		Integer  obj=sc.nextInt();
		
   StudentArray[] student=new StudentArray[obj];
   student[0]= new StudentArray(2333,"sathish","sathish@mailid");
   student[1]=new StudentArray(2334,"Vijay","Vijay@gmail.com");
   student[2]=new StudentArray(2335,"Dawood","Dawood@gmail.com");
   
     for(int i=0;i<student.length;i++) {
    	 System.out.println("Stuent Name:"+student[i].Name);
    	 System.out.println("Studnet id:"+student[i].id);
    	 System.out.println("Student mail:"+student[i].mailId);
    	 
     }
		
	
		

	}

}
