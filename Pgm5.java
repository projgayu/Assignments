package co.assignments.day4;

import java.util.Scanner;

public class Pgm5 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter the size");
		int size=scn.nextInt();
		int[]arr=new int[size];
		System.out.println("enter the num");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		boolean b =SeqArray.seq(arr);
		System.out.println(b);
		
	}

}
