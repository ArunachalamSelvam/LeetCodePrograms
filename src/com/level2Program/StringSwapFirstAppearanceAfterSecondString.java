package com.level2Program;

import java.util.Arrays;

public class StringSwapFirstAppearanceAfterSecondString {

	public static void main(String[] args) {
		String s1 = "This is a test String Only";
		String s2 = "st";
		
		String [] arr = toArray(s1);
		System.out.println(Arrays.toString(arr));
//		int left =0,right=s1.length();
//		
//
//		while(left<=right) {
//			if(!s1.contains(s2)) {
//				
//			}
//		}

	}
	
	public static String[] toArray(String s) {
		String[] arr = new String[10];
		String temp="";
		int count=0;
		int j=0,space=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				space=i;
				arr[j]=temp;
				temp="";
				j++;
				continue;
			}
			temp+=s.charAt(i);
			if(i==s.length()-1) {
				arr[j] = s.substring(space+1,s.length());
				j++;
			}
			if(arr[j]!=null ) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println(Arrays.toString(arr));
		String[] sArr = new String[count];
		
		for(int i=0;i<count;i++) {
			sArr[i] = arr[i];
		}
		return sArr;
	}

}
