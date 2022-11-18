package com.bridgelabz.day2;

public class SumOfNaturalNumberInLoop {

	public static void main(String[] args) {
	      
	    int sum = 0;
	    int n = 5;

	    // for loop
	    for (int i = 1; i <= n; ++i) {
	      // body inside for loop
	      sum += i;     // sum = sum + i
	    }
	       
	    System.out.println("Sum = " + sum);
	  }
	}