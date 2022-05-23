package com.assignments.day3;

import java.util.Scanner;

public class Pgm1 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
				int[] arr=new int[4];
				System.out.println("Enter the values");
				for (int i = 0; i < arr.length; i++) {
					arr[i]=scn.nextInt();
					
					
				}
				int sum=SumPower.getPower(arr);
				System.out.println(sum);
		
	}

}
