package com.level2Program;

//Excel Sheet Column Number To Column Title

public class NumberToAlphabet {
	
	public static void main(String[] args) {
		int n=52;
		String s = "";
		//System.out.println(s);
		while(n>0) {
			int remainder = (n-1) % 26;
			//s.insert(0, (char)(65+remainder));
			s= (char)(65+remainder) +s;
			n=(n-1)/26;
		}
		System.out.println(s.toString());
		
	}

}
