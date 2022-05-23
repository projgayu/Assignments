package co.assignments.day4;

public class SeqArray {
	public static boolean seq(int[] a)
	{
		boolean b=false;
		for (int i = 0; i < a.length-2; i++) {
			if(a[i]==1&& a[i+1]==2&&a[i+2]==3)
			{
				b=true;
				break;
			}
			
		}
		return b;
	}

}
