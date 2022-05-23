package com.assignments.day3;
import java.util.Arrays;

public class Pgm3 {
		public static int countsum(int[] a) {
			int large=0,small=0,sum=0;
			int n=a.length;
		
			
			Arrays.sort(a);
			if(a.length==1) {
					sum=a[0];
					
				}else if(a.length<1){
			for (int i = 0; i < n; i++) {
				
				small=a[0];
				large=a[n-1];
				}

			
			sum=large-small;
			
			
				}
			return sum;
		}

		
			

		}


