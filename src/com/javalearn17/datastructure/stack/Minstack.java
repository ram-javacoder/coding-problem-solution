package com.javalearn17.datastructure.stack;

import java.util.Comparator;
import java.util.Stack;
import java.util.stream.Collectors;

class Minstack {

	private Stack<Integer> mainStack;
	private Stack<Integer> minStack;

	// Constructor
	public Minstack() {
		mainStack = new Stack<>();
		minStack = new Stack<>();
	}

	// Push element onto stack
	public void push(int x) {
		mainStack.push(x);
		// Push to minStack if it’s smaller or equal to current min
		if (minStack.isEmpty() || x <= minStack.peek()) {
			minStack.push(x);
		}
	}

	// Remove the top element
	public void pop() {
		if (mainStack.isEmpty())
			return;

		int popped = mainStack.pop();
		if (popped == minStack.peek()) {
			minStack.pop();
		}
	}

	// Get top element
	public int top() {
		if (mainStack.isEmpty())
			throw new RuntimeException("Stack is empty");
		return mainStack.peek();
	}

	// Retrieve the minimum element in the stack
	public int getMin() {
		if (minStack.isEmpty())
			throw new RuntimeException("Stack is empty");
		return minStack.peek();
	}

	// Main method for testing
	public static void main(String[] args) {
		Minstack stack = new Minstack();
		
		
		
		stack.push(5);
		stack.push(3);
		stack.push(7);
		System.out.println("Min: " + stack.getMin()); // 3
		stack.pop();
		System.out.println("Top: " + stack.top()); // 3
		System.out.println("Min: " + stack.getMin()); // 3
		stack.pop();
		System.out.println("Min: " + stack.getMin()); // 5
	}

}
