package com.bridgelabz.day2;

public class FindMaxAndMin {

        public static void main(String[] args)
        {
                int a = 12;
                int b = 18;
                int c = 15;
                System.out.println("The Numbers are a= "+a+" b= "+b+" c= "+c);
                int max = (a>b ? (a>c ? a : c): (b>c ? b : c));
                System.out.println("Max= "+max);
                int min = (a<b ? (a<c ? a : c): (b<c ? b : c));
                System.out.println("Min= "+min);
        }
}