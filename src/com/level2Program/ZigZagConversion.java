package com.level2Program;

public class ZigZagConversion {

	public static void main(String[] args) {
		int numRows = 3;
		String s = "ZOHOISHIRING";
		
		String[] sArr = new String[numRows];
		int rows=0,dir=0;
		for(int i=0;i<numRows;i++) {
			sArr[i] = new String();
		}
		
		for(int i=0;i<s.length();i++) {
			rows+=dir;
			sArr[rows]+=s.charAt(i);
			
			if(rows==0 || rows==numRows-1) {
				dir = (dir==0) ? 1 : -dir;
			}
		}
		
		String out = "";
		for(int i=0;i<numRows;i++) {
			out+= sArr[i];
		}
		
		System.out.println(out);

	}

}
