package com.chainsys.day5;
import java.util.Scanner;
public class TestHouseConstructor {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Your HouseNo:");
        int obj=sc.nextInt();
        HouseConstructor[]obj1=new HouseConstructor[obj];
        
            obj1[0]= new  HouseConstructor(29,"Geetha","Chennai", 9000);
            obj1[1]=new  HouseConstructor(30,"SrM","tambaram",12000);
            obj1[2]=new  HouseConstructor(31,"kaviya","mathrvyol",9000);
            
            for(int i=0;i<obj1.length;i++) {
            	System.out.println(" plot NO:"+obj1[i].housePlotNo);
            	System.out.println("polt Rent:"+obj1[i].houseRent);
            	System.out.println("ploat addrees:"+obj1[i].houseAdrees);
            	System.out.println("plot name:"+obj1[i].houseName);
            }
           
          
            
	}

	

}
