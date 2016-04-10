package com.magicwolf.leetcode;

/**
 * Given a binary tree, determine if it is height-balanced.
 * 
 * For this problem, a height-balanced binary tree is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by more
 * than 1.
 * 
 * @author MagicWolf
 * 
 */
public class BalancedBinaryTree {
    public static boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        if (Math.abs(high(root.left) - high(root.right)) <= 1) {
            return isBalanced(root.left) && isBalanced(root.right);
        } else {
            return false;
        }
    }

    public static int high(TreeNode node) {
        if (null == node)
            return 0;
        return 1 + Math.max(high(node.left), high(node.right));
    }

    // 后序遍历
    public boolean isBalanced2(TreeNode root) {
        if (root == null)
            return true;
        int left = high(root.left);
        int right = high(root.right);
        return left != -1 && right != -1 && Math.abs(left - right) <= 1;
    }

    public int high2(TreeNode node) {
        if (null == node)
            return 0;
        int left = high(node.left);
        int right = high(node.right);
        if (left == -1 || right == -1 || Math.abs(left - right) > 1)
            return -1;
        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(isBalanced(root));
    }
}
