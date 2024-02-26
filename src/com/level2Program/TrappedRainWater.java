package com.level2Program;

import java.util.Stack;

public class TrappedRainWater {

	public static void main(String[] args) {
		int[] arr = {1,0,3,4,5,6,1,0,3,0,2,1,0,1};
		int leftmax = arr[0];
		Stack<Integer> rightMax = new Stack<>();
		rightMax.push(arr[arr.length-1]);
		
		for(int i=arr.length-2;i>=2;i--) {
			rightMax.push(Math.max(rightMax.peek(), arr[i]));
		}
		
		int totWater = 0;
		
		for(int i=1;i<arr.length-1;i++) {
			int min = Math.min(rightMax.peek(), leftmax);
			int temp = min - arr[i];
			totWater+= Math.max(0, temp);
			
			rightMax.pop();
			leftmax = Math.max(leftmax, arr[i]);
		}
		System.out.println(totWater);
	}

}
