package com.javalearn17.DataStructureAndAlgorithms;

public class BinarySearchTree {

	// Node class
	static class Node {
		int value;
		Node left, right;

		Node(int value) {
			this.value = value;
			left = right = null;
		}
	}

	Node root;

	// Insert a value
	public Node insert(Node root, int value) {
		if (root == null) {
			return new Node(value);
		}
		if (value < root.value) {
			root.left = insert(root.left, value);
		} else if (value > root.value) {
			root.right = insert(root.right, value);
		}
		return root;
	}

	// Search a value
	public boolean search(Node root, int key) {
		if (root == null)
			return false;
		if (root.value == key)
			return true;
		if (key < root.value)
			return search(root.left, key);
		return search(root.right, key);
	}

	// Inorder Traversal (Sorted order)
	public void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.value + " ");
			inorder(root.right);
		}
	}

	// Find minimum value node
	private Node minValueNode(Node node) {
		Node current = node;
		while (current.left != null) {
			current = current.left;
		}
		return current;
	}

	// Delete a node
	public Node delete(Node root, int key) {
		if (root == null)
			return root;

		if (key < root.value) {
			root.left = delete(root.left, key);
		} else if (key > root.value) {
			root.right = delete(root.right, key);
		} else {
			// Case 1: No child
			if (root.left == null && root.right == null)
				return null;

			// Case 2: One child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// Case 3: Two children
			Node successor = minValueNode(root.right);
			root.value = successor.value;
			root.right = delete(root.right, successor.value);
		}
		return root;
	}

	// Driver method
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();

		bst.root = bst.insert(bst.root, 50);
		bst.insert(bst.root, 30);
		bst.insert(bst.root, 20);
		bst.insert(bst.root, 40);
		bst.insert(bst.root, 70);
		bst.insert(bst.root, 60);
		bst.insert(bst.root, 80);

		System.out.print("Inorder Traversal (Sorted): ");
		bst.inorder(bst.root);

		System.out.println("\nSearch 40: " + bst.search(bst.root, 40));
		System.out.println("Search 90: " + bst.search(bst.root, 90));

		bst.root = bst.delete(bst.root, 20); // delete leaf
		bst.root = bst.delete(bst.root, 30); // delete node with one child
		bst.root = bst.delete(bst.root, 50); // delete node with two children

		System.out.print("Inorder after deletions: ");
		bst.inorder(bst.root);
	}
}
