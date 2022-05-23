package co.assignments.day4;

public class AddReverse {
	public static int addaReverse(int[] arr ,int b)
	{
		int sum=0;
		int rev=0;
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]>b)
			{
			sum=sum+arr[i];
		}
		}
			while(sum>0)
			{
				int t=sum%10;
				rev=rev*10+t;
				sum=sum/10;
			}
			return rev;

}
}
