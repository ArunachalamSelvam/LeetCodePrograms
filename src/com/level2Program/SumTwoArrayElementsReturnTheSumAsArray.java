package com.level2Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumTwoArrayElementsReturnTheSumAsArray {
	
	public static void sumArray(int[] a , int[] b) {
//		String n1="";
//		String n2="";
//		
//		for(int i=0;i<a.length;i++) {
//			n1+=a[i];
//		}
//		int j =0;
//		while(j<b.length) {
//			n2+=b[j];
//			j++;
//		}
//		int n = stringToNum(n1) + stringToNum(n2);
//		String s = intToString(n);
//		int [] out = new int [s.length()];
//		for(int i=0;i<s.length();i++) {
//			int num = Integer.parseInt(s.charAt(i)+"");
//			out[i] = num;
//		}
//		return out;
		
		int n1=0,n2=0;
		
		for(int i=0;i<a.length;i++) {
			n1=n1*10 + a[i];
		}
		
		for(int i=0;i<b.length;i++) {
			n2=n2*10 + b[i];
		}
		
		int n3 =n1+n2;
		List<Integer> list = new ArrayList<>();
		while(n3>0) {
			int digit = n3%10;
			list.add(0,digit);
			n3=n3/10;
		}
		
		System.out.println(list);
	}
	
	public static String toString(int[] out) {
		String s = "[";
		for(int i=0;i<out.length;i++) {
			
			s+= (i< out.length-1) ? out[i]+", " : out[i]+"]";
		}
		return s;
	}
	
	public static int stringToNum(String s) {
		int result = 0;
		int i=0;
		while(i<s.length()) {
			int digit = s.charAt(i) - '0';
			result = result * 10 + digit;
			i++;
		}
		return result;
	}
	
	public static String intToString(int n) {
		StringBuilder s = new StringBuilder();
		while(n>0) {
			s.insert(0, (char)((n%10)+'0'));
			n=n/10;
		}
		return s.toString();
	}
	public static void main(String[] args) {
		int[] a = {9,9,9,9};
		int[] b = {1,1,1};
		sumArray(a, b);
	}

}
