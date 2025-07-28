package com.javalearn17.datastructure;

class Node {

	int value;
	Node left, right;

	Node(int val) {

		value = val;
		left = right = null;

	}

}

class BST {

	Node root;

	void insert(int value) {

		root = insertRec(root, value);

	}

	Node insertRec(Node root, int value) {

		if (root == null) {
			return new Node(value);

		}
		if (value < root.value) {
			root.left = insertRec(root.left, value);
		} else if (value > root.value) {

			root.right = insertRec(root.right, value);

		}
		return root;

	}

	void inOrder() {

		inOrderRec(root);

	}

	private void inOrderRec(Node root) {

		if (root != null) {

			inOrderRec(root.left);
			System.out.println(root.value + " ");
			inOrderRec(root.right);

		}

	}

}

public class BSTImpl {

	public static void main(String[] args) {

		BST tree = new BST();

		tree.insert(50);
		tree.insert(30);
		tree.insert(70);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);

		System.out.println("In-Order traversal (sorted): ");
		tree.inOrder();
	}
}
