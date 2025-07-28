
package com.ty.learnjava17.stringprogram;

public class ReverseStringWithUsingInBuildMethod {

	public static void main(String[] args) {
		
		String input = "Java is beautiful";
		System.out.println("Original String: " + input);

		String reversed = reverseWords(input);
		System.out.println("Reversed Word by Word: " + reversed);
	}

	public static String reverseWords(String str) {
		char[] chars = str.toCharArray();
		int n = chars.length;

		// Step 1: Reverse the entire string
		reverse(chars, 0, n - 1);

		// Step 2: Reverse each word in the reversed string
		int start = 0;
		for (int i = 0;i <= n; i++) {
			if (i == n || chars[i] == ' ') {
				reverse(chars, start, i - 1);
				start = i + 1;
			}
		}

		return new String(chars);
	}

	// Helper method to reverse characters between two indices
	public static void reverse(char[] arr, int left, int right) {
		while (left < right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}

		
	}
}
