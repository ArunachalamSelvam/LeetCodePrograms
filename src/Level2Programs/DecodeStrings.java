package Level2Programs;

import java.util.Stack;

public class DecodeStrings {

	public static void main(String[] args) {
		String s = "3(a2(b))";
		
		Stack<Integer> numStack = new Stack<>();
		Stack<String> charStack = new Stack<>();

		for(int i=0;i<s.length();i++) {
			String temp = "";
			if(s.charAt(i)>='1' && s.charAt(i)<='9'){
					numStack.push(s.charAt(i)-'0');
			}
			
			else if(s.charAt(i) != ')') {
					charStack.push(s.charAt(i)+"");
			}
			
			else if(s.charAt(i) == ')') {
				while(!charStack.isEmpty() && !charStack.peek().equals("(") ) {
					temp = charStack.pop() + temp;
				}
				charStack.pop();
				
				int n = numStack.pop();
				String temp2="";
				while(n>0) {
					temp2 +=temp;
					n--;
				}
				charStack.push(temp2);
			}
		}
		
		System.out.println(charStack +"  "+ numStack);
	}

}
