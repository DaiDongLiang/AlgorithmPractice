package com.magicwolf.leetcode;

import java.util.Stack;

/**
 * 101. Symmetric Tree
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric
 * around its center).
 * 
 * @author MagicWolf
 * 
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        if(root.left==null&&root.right==null){
            return true;
        }else if(root.left==null||root.right==null){
            return false;
        }
        return isSymmetric(root.left, root.right);
    }
    public boolean isSymmetric(TreeNode node1,TreeNode node2) {
        if(node1==null&&node2==null){
            return true;
        }else if(node1==null||node2==null){
            return false;
        }
        if(node1.val!=node2.val)return false;
        return isSymmetric(node1.left,node2.right)&&isSymmetric(node1.right,node2.left);
    }
    public boolean isSymmetric2(TreeNode root) {
        if(root==null)return true;
        Stack<TreeNode> leftStack=new Stack<>();
        Stack<TreeNode> rightStack=new Stack<>();
        leftStack.push(root.left);
        rightStack.push(root.right);
        while(!(leftStack.empty()&&rightStack.empty())){
            TreeNode left=leftStack.pop();
            TreeNode right=leftStack.pop();
            if(left==null&&right==null) continue;
            if(left==null||right==null) return false;
            if(left.val==right.val){
                leftStack.push(left.left);
                leftStack.push(left.right);
                rightStack.push(right.right);
                rightStack.push(right.left);
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Stack<TreeNode> leftStack=new Stack<>();
    }
}
