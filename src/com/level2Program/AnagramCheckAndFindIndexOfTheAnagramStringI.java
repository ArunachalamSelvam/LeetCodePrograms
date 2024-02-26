package com.level2Program;

public class AnagramCheckAndFindIndexOfTheAnagramStringI {
	
	public static boolean isAnagram(String s , String t) {
		int[] freq = new int[26];
		
		if(s.length() != t.length()) {
			return false;
		}
		
		for(int i=0;i<s.length();i++) {
			freq[s.charAt(i) - 'a']++;
			freq[t.charAt(i) - 'a']--;
		}
		
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=0) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		String s = "abab";
		String t = "ab";
		
		for(int i=0;i<=s.length()-t.length();i++) {
			if(isAnagram(s.substring(i, i+t.length()), t)) {
				System.out.println(i);
			}
		}
	}

}
