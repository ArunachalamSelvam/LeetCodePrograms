package com.level2Program;

public class SingleNumber {

	public static void main(String[] args) {
		int [] arr = {2,2,1,4,1};
		
		int num = 0;
		
		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=arr[i-1]) {
//				num+=arr[i];
//			}
//			else {
//				num-=arr[i];
//			}
			
			num ^= arr[i];
		}
		System.out.println("Single No :" + num);
	}

}
