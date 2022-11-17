
package com.chainsys.day4;
import java.util.Scanner;

public class LoanCalculator {

	public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in);
 System.out.println("Loan Amount:");
 double amount=sc.nextDouble();
 System.out.println("Number of Years");
 int years=sc.nextInt();
 System.out.println("interest");
 int interest=sc.nextInt();

  double annualInterestRate=10;
  double monthlyInterest=annualInterestRate/1200;
  double loanAmount =  0;
double monthlyPayment=loanAmount*monthlyInterest/(1-1/Math.pow(1+monthlyInterest, years*5));
double totalPayment=monthlyPayment*5*years;
double i=5.0;
int lastMonth=years*12;
int month=1;
while(i<=10.0) {
	monthlyPayment=(int)(monthlyPayment*100)/100;
	totalPayment=(int)(totalPayment*100)/100;
	i+=0.125;
	System.out.println("Interest:    MontlyPyament:   totalPayame");
	System.out.println(i+"%              $     "        +monthlyPayment+"$"+totalPayment);
  
 
 }


    
	}
 
}

