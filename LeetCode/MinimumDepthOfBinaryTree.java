package com.magicwolf.leetcode;

/**
 * Given a binary tree, find its minimum depth.
 * 
 * The minimum depth is the number of nodes along the shortest path from the
 * root node down to the nearest leaf node.
 * 
 * Subscribe to see which companies asked this question
 * 
 * @author MagicWolf
 * 
 */
public class MinimumDepthOfBinaryTree {
    public static int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return 1;
        int left=root.left!=null?minDepth(root.left)+1:Integer.MAX_VALUE;
        int right=root.right!=null?minDepth(root.right)+1:Integer.MAX_VALUE;
        return Math.min(left, right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        System.out.println(minDepth(root));
    }
//    private int minDepth(TreeNode node) {
//        if(node==null) return 0;
//        if(node.left==null&&node.right==null) return 1;
//        int left=minDepth(node.left)+1;
//        int right=minDepth(node.right)+1;
//        return Math.min(left, right);
//    }
}
