package co.assignments.day4;

import java.util.Scanner;

public class Pgm6 {
public static void main(String[] args) {
	Scanner scn =new Scanner(System.in);
	int num=scn.nextInt();
	boolean b=PerfectNum.perfectCheck(num);
	if(b==true)
		System.out.println("given num is perfect num");
	else
		System.out.println("given num is not perfect num");
}

}
