package com.chainsys.day5Task;

public class AdditionOutput {
	public static void main(String s[])
    {
        int a = 4;//a=4 a++=4
        a++;//4
        a+=a;//5=5 5+5=10 --10
        --a;//9
        a=7+a;//7+9=16
        a*=a;//16*16=256
        a-=3;//256-3
        int a1=10;
        ++a1;
        a1+=a1;
        a1--;//21
        System.out.println("value:"+a1);
        
        

        System.out.println(" a = " + a );
    }
}


