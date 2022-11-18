package com.bridgelabz.day2;

import java.util.Scanner;

public class SumOfCommands {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any numbers: ");
		int s = input.nextInt();
		int r = input.nextInt();
		int sum = s + r;
		System.out.println("sum is " + sum);
		input.close();

	}

}