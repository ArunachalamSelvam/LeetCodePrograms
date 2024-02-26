package com.level2Program;

import java.util.Stack;

public class DecodeStrings {

	public static void main(String[] args) {
		String s = "3(a2(bb))";
		Stack<Integer> numStack = new Stack<>();
		Stack<String> charStack = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			String temp="";
			
			if(s.charAt(i)>='1' && s.charAt(i)<='9') {
				numStack.push(s.charAt(i) - '0');
			}
			else if(s.charAt(i)!=')') {
				charStack.push(s.charAt(i)+"");
			}
			//System.out.println(numStack +" " + charStack);
			if(!charStack.isEmpty() && s.charAt(i) == ')') {
				//System.out.println("check" + charStack);
				 while (!charStack.isEmpty() && !charStack.peek().equals("(")) {
	                    temp = charStack.pop() + temp;
	                }
	                charStack.pop();
				
				System.out.println(temp);
				//charStack.pop();
				
				String temp2="";
				int n = numStack.pop();
				while(n>0) {
					temp2+=temp;
					n--;
				}
				charStack.push(temp2);
			}
			
			System.out.println(numStack + " " + charStack);
			
		}
//		System.out.println(numStack +" " + charStack);
	System.out.println(charStack.peek());
	}

}
