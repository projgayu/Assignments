package com.assignments.day3;

public class Program4 {
	public static int largest(int[] a) {
		int sum=0,fir=0,mid=0,las=0,middle=a.length/2;
		int n=a.length;
		for (int i = 0; i < n; i++) {
			fir=a[0];
			mid=a[middle];
			las=a[n-1];
			
			
		}
		if((fir>mid)&&(fir>las)) {
			sum=fir;
			
		}else if((mid>fir)&&(mid>las)) {
			sum=mid;
		}
		else if((las>mid)&&(las>fir)) {
			sum=las;
		}
		return sum;
		
	}

}

