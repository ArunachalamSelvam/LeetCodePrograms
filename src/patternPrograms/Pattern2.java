package patternPrograms;

import java.util.Arrays;

//Image Rotation
//input :
//	1 2 3
//	4 5 6
//	7 8 9
//	
//output :
//	7 4 1
//	8 5 2
//	9 6 3
	
public class Pattern2 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},
					   {5,6,7,8},
					   {9,10,11,12},
					   {13,14,15,16}};
		int[][] a = arr.clone();
		int row = 0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		                            
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a[0].length;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}	
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<a.length;i++) {
			int k=arr.length-1;
			for(int j=0;j<a.length/2;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][k];
				arr[i][k--] = temp;
			}
		}
		
//		for(int j=0;j<arr.length;j++) {
//			int column = 0;
//			for(int i=arr.length-1;i>=0;i--) {
//				//int temp = arr[row][column];
//				a[row][column++] = arr[i][j];
//				
//			}
//			row++;
//		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
