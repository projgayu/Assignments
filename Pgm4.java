package com.assignments.day3;

import java.util.Scanner;

public class Pgm4 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=scn.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scn.nextInt();
			double avg=PrimeLoc.sumOfPrimeNum(arr);
			System.out.println("average of prime num "+avg);
		}
		
		
	}

}
