package com.chainsys.day5;
import java.util.Scanner;

public class TestCollegeDetails {

	public static void main(String[] args) {
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter No Colleges");
               int obj=sc.nextInt();
               
               CollegeDetails[] college=new CollegeDetails[obj];
               
               college[0]=new CollegeDetails(9345464826l,"Dhanalskmi","Perambalur");
               college[1]=new CollegeDetails(93454648426l,"Tagore","trichy");
               college[2]=new CollegeDetails(9345464276l,"VNT","Chennai");
               
               for(int i=0;i<college.length;i++) {
            	   System.out.println("ContactNo:"+college[i].collegeContactNo);
            	   System.out.println("CollegeName:"+college[i].collegeName);
            	   System.out.println("CollegeAdrees:"+college[i].CollegeAdrees);
               }
               
	}

}
