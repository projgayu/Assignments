package com.assignments.day3;

public class PrimeLoc {
	
		public static int sumOfPrimeNum(int[]a)
		{
			int sum=0;
			int avg=0;
			int count=0;
			for (int i = 2; i < a.length; i++) 
			{
				int t=i;
				int b=2;
				while(b<=2)
				{
					if(t%2==0)
{
	break;
}					b++;
						
				}
				if(b>t/2)
				{
					sum=sum+a[i];
					count++;
					
				}
				
			}
			avg=sum/count;
			return avg;
		}
	}


