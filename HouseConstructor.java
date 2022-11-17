package com.chainsys.day5;

public class HouseConstructor {
	int housePlotNo;
	String houseName;
	String houseAdrees;
	int houseRent;
	   HouseConstructor(){ //defaultConstructor
		   
	   }
	
HouseConstructor(int P,String N,String A,int R){ //parameter Constructor
	this.housePlotNo=P;
	this.houseName=N;
	this.houseAdrees=A;
	this.houseRent=R;
	

}
}
