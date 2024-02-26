package com.level2Program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int longestLength = 0;
		System.out.print("Enter The Array Length : ");
		int length = scanner.nextInt();
		
		int[] arr = new int[length];
		
		System.out.println("Enter The Values : ");
		for(int i=0;i<length;i++) {
			arr[i] = scanner.nextInt();
		}
		
		Map<Integer,Boolean> exploredMap = new HashMap<>();
		
		for(int num : arr) {
			exploredMap.put(num, false);
		}
		
		for(int num: arr) {
			int currentLength=1;
			
			//Check in forward
			int nextNum= num+1;
			
			while(exploredMap.containsKey(nextNum) && exploredMap.get(nextNum)==false) {
				currentLength++;
				exploredMap.put(nextNum, true);
				
				//move the Next Number
				nextNum++;
			}
			
			int prevNum= num-1;
			while(exploredMap.containsKey(prevNum) && exploredMap.get(prevNum)==false) {
				currentLength++;
				exploredMap.put(prevNum, true);
				
				//move the Next Number
				prevNum--;
			}
			
			longestLength = Math.max(currentLength, longestLength);
			
		}
		
		System.out.println(longestLength);
	}

}
