package com.chainsys.day5Task;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
     int year;
     System.out.println("Enter a year:");
     Scanner sc=new Scanner(System.in);
      year=sc.nextInt();
      while(year<=year&&(year%4==0)) {//2000/200
    	  System.out.println(year+"It's leap year");
    	  year++;
    	  System.out.println(year+"It is not leap year");
    	  year++;
    
      }
	}

}
