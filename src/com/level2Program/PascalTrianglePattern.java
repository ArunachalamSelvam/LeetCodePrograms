package com.level2Program;

public class PascalTrianglePattern {
	
	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			int temp=1;
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(temp+" ");
				temp=temp*(i-k)/k;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern(5);
	}

}
