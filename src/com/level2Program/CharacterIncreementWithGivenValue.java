package com.level2Program;

public class CharacterIncreementWithGivenValue {

	public static void main(String[] args) {
		String s = "Zoho";
		String out = "";
		int k=4;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				c =(char)(s.charAt(i)+32);
			
			}
			if((c>='a' && c<='z')) {
				
				if(c+k <='z') {
					out+=(char)(s.charAt(i)+k);
				}
				else {
					char ch = (char)(c+k - 'z');
					out+= (char)('a'+ch-1);
				}
			}
			else if((c>='0' && c<='9')) {
				
				if(c+k <='9') {
					out+=(char)(c+k);
				}
				else {
					char ch = (char)(c+k - '9');
					out+= (char)('0'+ch-1);
				}
			}
			else {
				out+=c;
			}
			
			
		}
		
		System.out.println(out);
		char c = 'B'+32;
		System.out.println(c);
	}

}
