package com.bridgelabz.day2;

import java.util.Scanner;

public class SumOfNaturalNumbers1 {
	private static Scanner sc;
	public static void main(String[] args) {
		
		int number, i, sum = 0;
		sc = new Scanner(System.in);
		
		System.out.println("Please Enter any number : ");
		number = sc.nextInt();
		
		for(i = 1; i <= number; i++)
		{
			sum = sum + i;
		}
		System.out.println("\n The Sum of Natural Numbers from 1 to "+ number + " - " + sum);
		
		}
	
}
