package com.chainsys.day5;

public class CollegeDetails {
	String collegeName;
	String CollegeAdrees;
	long collegeContactNo;
	  
	CollegeDetails(){
		
	}
	CollegeDetails(long i,String N,String A){
		this.collegeName=N;
		this.CollegeAdrees=A;
		this.collegeContactNo=i;
	}

}