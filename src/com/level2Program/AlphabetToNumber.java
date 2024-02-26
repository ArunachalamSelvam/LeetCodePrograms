package com.level2Program;
// Excel Sheet Column Title To Column Number
public class AlphabetToNumber {

	public static void main(String[] args) {
		String s = "ZY";

		long n=0;
//        int m=1;
//		if(s.length()==1) {
//			n+=Math.abs(64-s.charAt(0));
//		}
//		else {
//			for(int i=0;i<s.length();i++) {
//				if(i<s.length()-1) {
//					n+=Math.abs(64-s.charAt(i))*(Math.pow(26,m));
//                    m++;
//				}
//				else {
//					n+=Math.abs(64-s.charAt(i));
//				}
//			}
//        } 
		for(int i=0;i<s.length();i++) {
			int digit = s.charAt(i) - 'A' + 1;
			n= n*26 + digit;
		}

		System.out.println(n);
	}

}
