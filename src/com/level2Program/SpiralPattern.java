package com.level2Program;

import java.util.Scanner;

public class SpiralPattern {

	public static void main(String[] args) {
		System.out.println("Enter The No Of Rows : ");
		Scanner scanner = new Scanner (System.in);
		
		int n = scanner.nextInt();
		int top=0,bottom=n-1,left=0,right=n-1;
		int count=1;
		
		int[][] arr = new int[n][n];
		
		while (left <= right && top <= bottom) {
			
			for (int i = top; i <= bottom; i++) {
				arr[i][left] = count++;
			}
			left++;

			for (int i = left; i <= right; i++) {
				arr[bottom][i] = count++;
			}
			bottom--;

			for (int i = bottom; i >= top; i--) {
				arr[i][right] = count++;
			}
			right--;

			for (int i = right; i >= left; i--) {
				arr[top][i] = count++;
			}
			top++;
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int k=0;k<arr[i].length;k++) {
					System.out.print(arr[i][k]+"  ");
			}
			System.out.println();
		}
	}

}
