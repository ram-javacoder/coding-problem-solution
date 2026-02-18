package com.javalearn17.DataStructureAndAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class FindTargetBST {

	class Node {
		int val;
		Node left, right;

		Node(int val) {
			this.val = val;
			left = right = null;

		}

	}

	Node root;

	public Node insert(Node root, int key) {
		if (root == null) {
			return new Node(key);

		}
		if (key < root.val) {
			root.left = insert(root.left, key);

		} else {
			root.right = insert(root.right, key);
		}
		return root;
	}

	public void inOrder(Node root, List<Integer> list) {
		if (root == null) {

			return;
		}

		inOrder(root.left, list);
		list.add(root.val);
		inOrder(root.right, list);

	}

	public boolean findTarget(Node root, int key) {
		List<Integer> list = new ArrayList<>();
		inOrder(root, list);

		int left = 0, right = list.size() - 1;
		while (left < right) {
			int sum = list.get(left) + list.get(right);
			if (sum == key) {
				System.out.println("Found pair: " + list.get(left) + ", " + list.get(right));
				return true;
			}
			if (sum < key) {
				left++;
			} else {
				right--;
			}

		}

		return false;

	}

	public static void main(String[] args) {

		FindTargetBST bst = new FindTargetBST();
		bst.root = bst.insert(bst.root, 5);
		bst.insert(bst.root, 3);
		bst.insert(bst.root, 6);
		bst.insert(bst.root, 10);
		bst.insert(bst.root, 3);
		bst.insert(bst.root, 4);

		// bst.inOrder(bst.root,new ArrayList<>());
		System.out.println("Target of 9: " + bst.findTarget(bst.root, 9));

	}

}
