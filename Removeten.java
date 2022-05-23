package co.assignments.day4;

public class Removeten {
	public static int[] removeTENS(int[] arr)
	{
		int[] arr1 =new int[arr.length];
				int s=0;
		for (int i = 0; i < arr.length; i++) 
		{
		if(arr[i]%10!=0)	
		{
			arr1[s]=arr[i];
			s++;
		}
		}
		return arr1;
	}

}
