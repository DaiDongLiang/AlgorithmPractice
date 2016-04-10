package com.magicwolf.leetcode;

/**
 * 翻转二叉树
 * @author MagicWolf
 *
 */
public class InvertBinaryTree {
    public static TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
    
    public static void invert(TreeNode node){
        if(node==null) return;
        TreeNode left=node.left;
        TreeNode right=node.right;
        node.left=right;
        node.right=left;
        invert(node.left);
        invert(node.right);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        System.out.println(invertTree(root).right.val);
    }
}

