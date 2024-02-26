package com.level2Program;

import java.util.Stack;

public class MakeValidParanthesisByAdd {

	public static void main(String[] args) {
		Stack <Character> stack = new Stack<>();
		String s = "())())(())())";
		String out="";
		String open="("; String close=")";
		
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)=='(' && stack.isEmpty()) {
				stack.push('(');
				out+='(';
				
			}
			else if(s.charAt(i)==')') {
				if(!stack.isEmpty() && stack.peek()=='(') {
					out+=')';
					stack.pop();
				} else if(s.charAt(i+1)==')'){
					open+='(';
					close += ')';
					
				} else {
					out+=open;
					out+=close;
					open="(";
					close=")";
				}
			}
		}
		
		System.out.println(out);
	}

}
