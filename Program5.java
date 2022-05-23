package com.assignments.day3;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		int fir=scn.nextInt();
		int[] arr1=new int[fir];
		int[] arr2=new int[fir];
		System.out.println("Enter the value for  1st array");
		for (int i = 0; i < arr1.length; i++) 
		{
			arr1[i]=scn.nextInt();
		}
		System.out.println("Enter s value for 2nd array");
		for (int i = 0; i < arr2.length; i++)
		{
			arr2[i]=scn.nextInt();
		}
		int sum=CommomElement.commonSum(arr1,arr2);
		System.out.println("sum of the coomon elements:"+sum);		
	}

}
