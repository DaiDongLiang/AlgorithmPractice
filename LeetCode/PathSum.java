package com.magicwolf.leetcode;


/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path
 * such that adding up all the values along the path equals the given sum.
 *  For example:
 *   Given the below binary tree and sum = 22,
 *             5
 *            / \
 *           4   8
 *          /   / \
 *         11  13  4
 *        /  \      \
 *       7    2      1
 *   return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 * @author MagicWolf
 * 
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)return false;
        return pathSum(root,0, sum);
    }
    private boolean pathSum(TreeNode node,int current,int sum){
        if(node.left==null&&node.right==null&&(node.val+current)==sum) return true;
        if(node.left!=null){
            if(pathSum(node.left, current+node.val, sum)) return true;
        }
        if(node.right!=null){
            if(pathSum(node.right, current+node.val, sum)) return true;
        }
        return false;
    }
}
