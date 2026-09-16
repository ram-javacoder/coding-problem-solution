package com.javalearn17.DataStructureAndAlgorithms;

/*
Given the root of a binary tree, return the same tree where every subtree (of the given tree)
not containing a 1 has been removed. A subtree of a node node is node plus every node that is a descendant of node.

Input: root = [1,null,0,0,1]
Output: [1,null,0,null,1]

Explanation:
Only the red nodes satisfy the property "every subtree not containing a 1".
The diagram on the right represents the answer.
*/


public class TreeBrune {

    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Prune the binary tree
    public static TreeNode pruneTree(TreeNode root) {

        // Base case
        if (root == null) {
            return null;
        }

        // Prune left subtree
        root.left = pruneTree(root.left);

        // Prune right subtree
        root.right = pruneTree(root.right);

        // If current node is 0 and has no children,
        // remove this node
        if (root.val == 0 &&
                root.left == null &&
                root.right == null) {

            return null;
        }

        return root;
    }

    // Inorder traversal to display the tree
    public static void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        System.out.print(root.val + " ");

        inorder(root.right);
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               0   1
              / \
             0   0
        */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(0);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(0);

        System.out.println("Before pruning:");
        inorder(root);

        // Prune the tree
        root = pruneTree(root);

        System.out.println("\nAfter pruning:");
        inorder(root);
    }

}
