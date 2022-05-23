package com.assignments.day3;

public class CommomElement 
{
	public static int commonSum(int[]a,int[] b)
	{
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				if (a[i]==b[i]) 
				{
					sum=sum+a[i];
				}
				
			}
			
		}
		if(sum>0)
			return sum;
		else
			return -1;
				
	}

}
