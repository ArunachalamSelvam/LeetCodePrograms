package com.level2Program;

public class ReverseString {
	
	public static String reverse(String s) {
		if(s.length() == 1) {
			return s.charAt(0)+"";
		}
		
		return s.charAt(s.length()-1)+ reverse(s.substring(0,s.length()-1));
	}
	public static void main(String[] args) {
		System.out.println(reverse("Arun"));

	}

}
