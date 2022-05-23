package co.assignments.day4;

import java.util.Scanner;

public class Pgm2 {
public static void main(String[] args) 
{
	Scanner scn=new Scanner(System.in);
			int[]arr=new int[5];
			System.out.println("enter the elements");
			for (int i = 0; i < arr.length; i++) 
			{
				arr[i]=scn.nextInt();
			}
			System.out.println("enter the num");
			int b=scn.nextInt();
					int revse=AddReverse.addaReverse(arr,b);
		System.out.println("reverse num :"+revse);
}
}
