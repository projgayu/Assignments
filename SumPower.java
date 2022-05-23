package com.assignments.day3;

public class SumPower {
	static int getPower(int[]a)
	{
		int sum=1;
		for (int i = 1; i < a.length; i++) {
			int t=1;
			int power=1;
			while(t>0)
			{
				power=power*a[i];
						t--;
			}
			sum=sum+power;
			
		}
		return sum;
		
	}

}
