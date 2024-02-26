package com.level2Program;

import java.util.Arrays;

public class MergeTwoArray {
	public static int[] arrayTrim(int[] arr) {
		int count=0;
		for(int n : arr) {
			if(n!=0) {
				count++;
			}
		}
		
		int[] out = new int[count]; 	
		
		for(int m=0;m<out.length;m++) {
			out[m] = arr[m];
		}
		return out;
	}
	public static int[] mergeArrays(int[]a, int[]b) {
		int [] merge = new int [a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				if(k==0 || merge[k-1] != a[i]) {
					merge[k++] = a[i++];
				}
			}
			else if(a[i]>b[j]){
				if(k==0 || merge[k-1] != b[j]) {
					merge[k++] = b[j++];
				}
			}
			else {
				// If elements are equal, add one to the merged array and move both pointers
                if (k == 0 || merge[k - 1] != a[i]) {
                    // Only add if it's the first element or it's not a duplicate
                    merge[k++] = a[i];
                }
                i++;
                j++;
			}
		}
		System.out.println("i = " + i + ", j =" + j);
		//handle remaining elements in a[]
		while(i<a.length) {
			if(k==0 || merge[k-1]!= a[i]) {
				merge[k++] = a[i++];
			}
		}
		
		//handle remaining elements in b[]
				while(j<b.length) {
					if(k==0 || merge[k-1]!= b[j]) {
						merge[k++] = b[j++];
					}
				}
				
			
				//System.out.println(Arrays.toString(merge));
				return arrayTrim(merge);
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(com.level2Program.SumTwoArrayElementsReturnTheSumAsArray.toString(mergeArrays(new int[] {1,2,3,4,5}, new int[]{4,5,6,7})));
	}

}
