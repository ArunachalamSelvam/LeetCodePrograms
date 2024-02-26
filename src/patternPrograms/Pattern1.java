package patternPrograms;

import java.util.Scanner;

// input : 5
//	5				1
//		4		2
//			3
//		2		4
//	1				5
		
public class Pattern1 {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter The No Of Rows : ");
		int n = scanner.nextInt();
		
//		for(int i=1;i<=n;i++) {
//			for(int j=n;j>=1;j--) {
//				if(i+j == n+1 || i==j) {
//					if(i<=n/2) {
//						if(j>=n/2) {
//							System.out.print(j+" ");
//						}
//						else if(j<n/2) {
//							System.out.print(i+" ");
//						}
//					}
//					else if(i>n/2) {
//						if(j>n/2) {
//							System.out.print(n+1-i+" ");
//						}
//						else if(j<=n/2) {
//							System.out.print(i+" ");
//						}
//					}
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					System.out.print(n -i);
				}
				else if(i+j == n-1) {
					System.out.print(i+1);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
