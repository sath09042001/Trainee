package com.chainsys.day4;

public class TestBookConstructor {

	public static void main(String[] args) {
         
		BookConstructor s1=new BookConstructor(111,"sathish");{
		System.out.println(s1.id+"\t"+s1.name);
		}
	BookConstructor s2=new BookConstructor(20, "vijay");
	System.out.println(s2.bookName+s2.Book);

}
}
