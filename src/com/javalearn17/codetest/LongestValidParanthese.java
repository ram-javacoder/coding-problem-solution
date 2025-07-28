package com.javalearn17.codetest;

import java.util.Stack;

public class LongestValidParanthese {

	public static void main(String[] args) {
		
		String input = "(()())(";
		int result = findLongestValidParanthese(input);
		System.out.println("Input: " +input);
		System.out.println("Longest valid parantheses: " +result);
		
	}

	private static int findLongestValidParanthese(String input) {
		Stack<Integer> stack = new Stack<Integer>();
		int maxLength=0;
		stack.push(-1);
		
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
					
			if (ch == '(') {
				stack.push(i);
			}
			else {
				stack.pop();
				if (stack.isEmpty()) {
					stack.push(i);
				} else {

					int length = i - stack.peek();
					maxLength = Math.max(maxLength, length);
				}
				
				
				
			}
			
			
			
		}
		
		
		return maxLength;
	}
	
	
}
