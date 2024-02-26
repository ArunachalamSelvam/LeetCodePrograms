package com.level2Program;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringWithoutRepeatingValuesAndSpace {
	

	public static boolean contains(String s,char c) {

		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch==c) {
				return true;
			}
			
		}
		return false;
	}
	public static void main(String[] args) {
		//ReverseStringWithoutRepeatingValuesAndSpace r = new ReverseStringWithoutRepeatingValuesAndSpace(new String[] {"A","R","U","N"});

		String s = "Geeks For Geeks";
		String s1 = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			if(!contains(s1,s.charAt(i))) {
				//System.out.println(s1);
				if(s.charAt(i)!=' ')
				  s1+=s.charAt(i);
			}
		}
		
		System.out.println(s1);
		//scanner.close();
		
//		System.out.println(Arrays.toString(args));

	}
	
	

}
