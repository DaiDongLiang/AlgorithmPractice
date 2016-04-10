package com.magicwolf.leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

    For example:
    Given binary tree {3,9,20,#,#,15,7},
        3
       / \
      9  20
        /  \
       15   7
    return its level order traversal as:
    [
      [3],
      [9,20],
      [15,7]
    ]
 * @author MagicWolf
 *
 */
public class BinaryTreeLevelOrderTraversal {
    
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result=new LinkedList<>();
        if(root==null)return result;
        List<Integer> level=new LinkedList<>();
        Queue<TreeNode> layer=new LinkedList<>();
        layer.add(root);
        layer.add(null);
        while(!layer.isEmpty()){
            TreeNode node=layer.poll();
            if(node==null){
                result.add(level);
                if(!layer.isEmpty())layer.add(null);
                level=new LinkedList<>();
            }else{
                level.add(node.val);
                if(node.left!=null) layer.add(node.left);
                if(node.right!=null) layer.add(node.right);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(levelOrderBottom(root));
    }
}
