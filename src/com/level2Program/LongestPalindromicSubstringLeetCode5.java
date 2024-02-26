package com.level2Program;

public class LongestPalindromicSubstringLeetCode5 {

	public static void main(String[] args) {
		String s = "abcde";
		String lps = "";
		for(int i=1;i<s.length();i++) {
			//Consider Odd Length
			int low=i,high=i;
			
			while(s.charAt(low) == s.charAt(high)) {
				low--;
				high++;
				
				if(low==-1 || high == s.length()) {
					break;
				}
			}
			
			String palindrome = s.substring(low+1,high);
			
			if(palindrome.length()>lps.length()) {
				lps=palindrome;
			}
			
			// consider even length
			low=i-1;
			high=i;
			while(s.charAt(low)==s.charAt(high))
			{
				low--;
				high++;
				
				if(low==-1 || high==s.length()) {
					break;
				}
			}
			
			palindrome = s.substring(low+1,high);
			
			if(palindrome.length()>lps.length()) {
				lps=palindrome;
			}
		}
		
		System.out.println(lps);
		
	}

}
