package com.javalearn17.datastructure.stack;

public class Stack {

	static final int max = 1000;
	int top;
	int a[] = new int[max];

	public Stack() {

		top = -1;
	}

	// isEmpty()
	boolean isEmpty() {

		if (top < 0) {

			return false;
		} else {

			return true;
		}

	}

	// push
	boolean push(int x) {

		if (x >= (max - 1)) {
			System.out.println("Stack overflow!");
			return false;
		} else {
			a[++top] = x;
			System.out.println(x + " pushed into the stack");
			return true;

		}

	}

	// pop
	int pop() {

		if (top < 0) {
			System.out.println("Stack is Empty!");
			return 0;
		} else {
			int x = a[top--];
			return x;

		}

	}

	// peek
	int peek() {

		if (top < 0) {

			System.out.println("Stack is Empty!");
			return 0;
		} else {

			int x = a[top];
			return x;

		}

	}

	void print() {

		for (int i = top; i > -1; i--) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {

		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);

		System.out.println(s.pop() + " Element poped from stack");
		System.out.println("Top element peeked : " + s.peek());
		System.out.println("Elements present in stack :");
		s.print();

	}

}
