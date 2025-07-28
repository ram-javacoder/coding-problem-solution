package com.javalearn17.datastructure.stack;

import java.util.Stack;
//longest contiguous valid parentheses substring

/*input :  "()(()"
output : 2

Input: ")()())"
output : 4*/
	
public class LongestValidParantheses {
	public static void main(String args[]) {

		String str = ")()())";
		int result = longestValidParentheses(str);
		System.out.println("Output : " + result);

	}

		public static int longestValidParentheses(String s) {
			
			 Stack<Integer> stack = new Stack<>();
		        stack.push(-1);  // Base for valid substring length
		        int maxLen = 0;

		        for (int i = 0; i < s.length(); i++) {
		            char c = s.charAt(i);
		            if (c == '(') {
		                stack.push(i);
		            } else {
		                stack.pop(); // match with a '('
		                if (stack.isEmpty()) {
		                    stack.push(i); // reset base
		                } else {
		                    maxLen = Math.max(maxLen, i - stack.peek());
		                }
		            }
		        }

		        return maxLen;
		    }
			
}
