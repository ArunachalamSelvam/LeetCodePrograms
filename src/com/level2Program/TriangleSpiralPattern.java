package com.level2Program;

import java.util.Arrays;
import java.util.Scanner;

public class TriangleSpiralPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter The No Of Rows :");
		int n = scanner.nextInt();
		int top = 0,bottom = n-1,left=0, right=n-1;
		int count=1;
		
		int [][] arr = new int [n] [n];
		while(left<right && top < bottom) {
			
			for(int i=top;i<=bottom;i++) {
				arr[i][left] = count++;
			}
			bottom--;
			left++;
			
			for(int i=bottom;i>=top;i--) {
				arr[i][right-i] = count++;
			}
			right--;
			bottom--;
			
			if(top!=bottom && left!=right) {
			for(int i=right;i>=left;i--) {
				arr[top][i] = count++;
			}
			top++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<arr[i].length;k++) {
				if(arr[i][k]!=0) {
					System.out.print(arr[i][k]+"  ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
