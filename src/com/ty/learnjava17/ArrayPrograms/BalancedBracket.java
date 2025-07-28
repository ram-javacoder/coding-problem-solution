package com.ty.learnjava17.ArrayPrograms;

import java.util.Stack;

public class BalancedBracket {

	public static void main(String[] args) {

		String str_1 = "{[({})]}";
		String str_2 = "{[(])}";

		System.out.println(str_1 + " -> " + (isBalanced(str_1) ? "Balanced" : "UnBalanced"));
		System.out.println(str_2 + " -> " + (isBalanced(str_2) ? "Balanced" : "UnBalanced"));
	}

	private static boolean isBalanced(String str_1) {
		Stack<Character> stack = new Stack<Character>();

		for (Character ch : str_1.toCharArray()) {

			if (ch == '{' || ch == '[' || ch == '(') {

				stack.push(ch);
			}

			else if (stack.isEmpty() || !isMatch(stack.pop(), ch)) {
				return false;

			}

		}

		return stack.isEmpty();

	}

	private static boolean isMatch(Character pop, Character ch) {

		if ((pop == '{' && ch == '}') || (pop == '[' && ch == ']') || (pop == '(' && ch == ')')) {

			return true;

		}

		return false;
	}
}
