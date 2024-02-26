package com.level2Program;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {
	
	public static boolean isHappyNumber(int n) {
		Set<Integer> usedInteger = new HashSet<>();
		while(true) {
			int sum=0;
			while(n>0) {
				int digit = n%10;
				sum+= digit * digit;
				n=n/10;
			}
			
			if(sum == 1)
				return true;
			
			n=sum;
			
			if(usedInteger.contains(n)) {
				return false;
			}
			usedInteger.add(n);
			
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int n = scanner.nextInt();
		
		System.out.println(isHappyNumber(n));

	}

}
