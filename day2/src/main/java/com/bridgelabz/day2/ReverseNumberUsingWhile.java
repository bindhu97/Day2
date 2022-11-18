package com.bridgelabz.day2;

import java.util.Scanner;

public class ReverseNumberUsingWhile {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int Number, Reminder, Reverse = 0;
		sc = new Scanner (System.in);
		
		System.out.println("\n Please Enter any number you want to reverse : ");
		Number = sc.nextInt();
		
		while(Number > 0) {
				Reminder = Number %10;
				Reverse = Reverse *10 + Reminder;
				Number = Number /10;
	}
		System.out.format("\n Reverse of entered number is = %d\n", Reverse);
	

	}

}
