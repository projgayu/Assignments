package co.assignments.day4;

public class PerfectNum {
	public static boolean perfectCheck(int num)
	{
		int a=1;int sum=0;
		while(a<=num/2)
		{
			if(num%a==0)
			{
				sum=sum+a;
			}
			a++;
		}
		if(num==sum)
			return true;
		else
			return false;
	}
				

}
