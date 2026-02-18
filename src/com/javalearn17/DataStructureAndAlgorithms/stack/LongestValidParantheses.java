package com.javalearn17.DataStructureAndAlgorithms.stack;

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
		stack.push(-1); // Base for valid substring length
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

//Time complexity is O(n) because we traverse the string once, and each index is pushed and popped at most once. Space complexity is O(n) for the stack.

/*
 * We solve this using a stack to track indices of characters. The idea is:
 * 
 * Push a base index (-1) to handle edge cases.
 */
/*
 * Traverse the string:
 * 
 * If we find '(', we push its index.
 * 
 * If we find ')', we pop from the stack to match with a '('.
 * 
 * If the stack becomes empty, it means there’s no matching '(' for this ')', so
 * we set a new base index.
 * 
 * If the stack is not empty after popping, we calculate the length from the
 * current index to the index at the top of the stack and update maxLen."
 **/