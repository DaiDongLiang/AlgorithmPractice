package com.magicwolf.leetcode;

/**
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and
 * the nodes have the same value.
 * 
 * @author MagicWolf
 * 
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return equal(p, q);
    }
    public boolean equal(TreeNode node1, TreeNode node2){
        if(node2==null&&node1==null){
            return true;
        }else if(node1!=null&&node2!=null&&node1.val==node2.val){
            return equal(node1.left, node2.left)&&equal(node1.right, node2.right);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        
    }
}
