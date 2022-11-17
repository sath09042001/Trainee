package com.chainsys.day4;
import java.util.Scanner;

public class Forloop3 {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int num;
         System.out.println("Enter a Poasitive integer:");
         num=sc.nextInt();
         System.out.println("Mutipication Table of:"+num);
         for(int i=0;i<=5;i++) {
        	 System.out.println(num+"x"+i+"="+(num*i));
         }
         for(int i=1;i<=8;i++) {
        	 System.out.println(num+"/"+i+"The next ouput:"+(num/i));
         }
	}

}
