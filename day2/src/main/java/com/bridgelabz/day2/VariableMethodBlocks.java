package com.bridgelabz.day2;

public class VariableMethodBlocks {
	static int a = 20;        //variable
	
	static void display()      //Method
	{
		System.out.println("This is my static method");
	}
	static {
		System.out.println("This is my static Block");     //Blocks
	}
	

	
	public static void main(String[] args) {
		System.out.println("This is my static variable " + VariableMethodBlocks.a);
VariableMethodBlocks.display();


	}

}
