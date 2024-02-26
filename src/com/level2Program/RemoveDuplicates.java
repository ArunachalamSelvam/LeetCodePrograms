package com.level2Program;

import java.util.Scanner;

public class RemoveDuplicates {

	public static char[] toCharArray(String s) {
		char[] c = new char[s.length()];
		
		for(int i=0;i<s.length();i++) {
			c[i] = s.charAt(i);
		}
		
		return c;
	}
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter The String :");
		String s = userInput.nextLine();
		
		char[] c = toCharArray(s);
		
		for(int i=1;i<s.length();i++) {
			boolean flag = true;
			
			for(int j=0;j<i;j++) {
				if(c[i]==c[j] || Math.abs(c[i]-c[j])==32) {
					if(c[i]=='Z') {
						c[i] = 'A';
						flag = false;
					}
					
					else if(c[i]=='z') {
						c[i] = 'a';
						flag = false;
					}
					
					else if(c[i]=='9') {
						c[i]='0';
						flag = false;

					}
					
					else
						c[i]++;
					
					if(!flag) {
						i--;
						break;
						
					}
				}
			}
			
		}
		
		System.out.println(new String(c));
		
	}

}
