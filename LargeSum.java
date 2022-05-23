package com.assignments.day3;

import java.util.Scanner;

public class LargeSum {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the size");
		int n=scn.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++)
		{
			a[i]=scn.nextInt();
			
		}
		System.out.println(Program4.largest(a));
		
		
	}
	

	}


