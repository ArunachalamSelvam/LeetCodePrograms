package com.level2Program;

import java.util.Arrays;

public class MoveZeroesToTheLast {

	public static void main(String[] args) {
		int [] arr = {1,3,4,0,5,6};
		int start = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp= arr[start];
				arr[start]=arr[i];
				arr[i]=temp;
				
				start++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
