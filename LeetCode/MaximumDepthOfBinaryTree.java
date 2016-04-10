package com.magicwolf.leetcode;


public class MaximumDepthOfBinaryTree {
    
    public static int maxDepth(TreeNode root) {
        return null==root?0:search(root, 0, 0);
    }
    public static int search(TreeNode node,int layer,int result){
        layer++;
        if(node.left!=null){
            result=search(node.left, layer, result);
        }
        if(node.right!=null){
            result=search(node.right, layer, result);
        }
        result=layer>result?layer:result;
        return result;
    }
    
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(4);
        root.right.left.right=new TreeNode(5);
        System.out.println(maxDepth(root));
    }
    
}
