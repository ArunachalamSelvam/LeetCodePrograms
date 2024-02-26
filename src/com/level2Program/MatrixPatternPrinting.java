package com.level2Program;

import java.util.Scanner;

/*
 *  5  4  1  2  3
 *  10 9  6  7  8
 *  15 14 11 12 13
 *  20 19 16 17 18
 *  25 24 21 22 23
 *  
 */
public class MatrixPatternPrinting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The No Of Rows : ");
		int rows = scanner.nextInt();
		//int i=0,count=1;
		int[][] arr = new int[rows][rows];
//		while(i<rows) {				
//				for(int j=rows/2;j<rows;j++) {
//					arr[i][j] = count++;
//				}
//				for(int j=rows/2-1;j>=0;j--) {
//					arr[i][j] = count++;
//				}
//				
//
//			i++;
//		}
//		
//		for(int k=0;k<arr.length;k++) {
//			for(int j=0;j<arr.length;j++) {
//				System.out.print(arr[k][j] + " ");
//			}
//			System.out.println();
//		}
		
		
		int print;
		for(int i=1;i<=rows;i++) {
			print = i*rows;
			
			for(int j=1;j<=rows/2;j++) {
				System.out.print(print +" ");
				print--;
			}
			
			for(int j=rows/2+1;j>=1;j--) {
				System.out.print(print-j+1  +" ");
				//print++;
			}
			System.out.println();
			
		}
	}

}
