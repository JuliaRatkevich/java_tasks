package com.julia;

public class Tree {

    TreeNode root;

    public int size() {                            //найти колво вершин в дереве
     return recursiveSize(root);
    }

    public int height() {
        return height(root, 0);
    }

    public static Tree generate() {
        // leaves
        TreeNode node4 = new TreeNode();
        TreeNode node8 = new TreeNode();
        TreeNode node6 = new TreeNode();
        TreeNode node7 = new TreeNode();

        TreeNode node5 = new TreeNode();
        node5.left = node8;

        TreeNode node2 = new TreeNode();
        node2.left = node4;
        node2.right = node5;

        TreeNode node3 = new TreeNode();
        node3.left = node6;
        node3.right = node7;

        TreeNode node1 = new TreeNode();
        node1.left = node2;
        node1.right = node3;

        Tree tree = new Tree();
        tree.root = node1;

        return tree;
    }

    private  int recursiveSize(TreeNode node) {

        if (node.left == null && node.right == null)
            return 1;

        if(node.left == null)
            return 1 + recursiveSize(node.right);

        if(node.right == null)
            return 1 + recursiveSize(node.left);

        return 1 + recursiveSize(node.left) + recursiveSize(node.right);
    }

    private  int optimal_recursiveSize(TreeNode node) {

        if (node == null)
            return 0;

        return 1 + recursiveSize(node.left) + recursiveSize(node.right);
    }

    private int height(TreeNode node, int current) {

        if (node.left == null && node.right == null) {
            return current;
        }

        int leftHeight = 0;
        if (node.left != null) {
            leftHeight = height(node.left, current + 1);
        }

        int rightHeight = 0;
        if (node.right != null) {
            rightHeight = height(node.right, current + 1);
        }

        return Math.max(leftHeight, rightHeight);
    }

    private int heightR(TreeNode node) {
        if (node.left == null && node.right == null) {
            return 0;
        }

        int leftHeight = heightR(node.left);
        int rightHeight = heightR(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

}
