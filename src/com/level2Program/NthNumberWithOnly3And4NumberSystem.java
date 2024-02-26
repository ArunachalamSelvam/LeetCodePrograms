package com.level2Program;

/* Form a Number System with only 3 and 4 and find Nth Number in the Number System.
 * The Numbers are : 3,4,33,34,43,44,333,334,343,344,433,434,443,444,3333,3334,3343,3344,3433,3434,3443,3444...
 */


public class NthNumberWithOnly3And4NumberSystem {

	public static int findNthNumber(int n) {
		int out=0,count=0,i=3;

		while (count < n) {
			//int j = i;
			if (isMatch(i)) {
				out = i;
				count++;
			}
			i++;

		}
		return out;
	}
	
	public static boolean isMatch(int i) {
		int rev=0;
		while(i>0) {
			rev=i%10;
			if(rev != 3 && rev!= 4) {
				return false;
			}
			i=i/10;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(findNthNumber(7));
	}
	
}
