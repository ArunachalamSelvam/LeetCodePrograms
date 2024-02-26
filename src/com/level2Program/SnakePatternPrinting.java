package com.level2Program;

public class SnakePatternPrinting {

	public static void main(String[] args) {
		int print=0;
		int n=4;
		
//		for(int i=1;i<=n;i++)
//		{
//			if(i>1) {
//				print+=4+1;
//			}
//		
//			for(int j=1;j<=4;j++)
//			{
//				if(i%2!=0)
//				{
//					System.out.print(++print + " ");
//					
//				}
//				else
//				{
//					System.out.print(--print + " ");
//				}
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=4;i++) {
//			
//			if(i%2 == 0) {
//				print = print+n-1;
//				odd=print+1;
//			}
//			
//			//int even = i*n;
//			for(int j=n+1;j>1;j--) {
//				if(i%2 !=0) {
//					System.out.print(odd++ +" ");
//					print++;
//				}
//				else {
//					System.out.print(print-- + " ");
//					//print = even;
//				}
//			}
//			System.out.println();
//		}
		
		
		for(int i=1;i<=5;i++) {
			int temp=1;
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print(temp +" ");
				temp=temp*(i-k)/k;
			}
			System.out.println();
		}
	}

}
