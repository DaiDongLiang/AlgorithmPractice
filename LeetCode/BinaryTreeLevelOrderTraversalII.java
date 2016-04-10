package com.magicwolf.leetcode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {
    
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result=new LinkedList<>();
        if(root==null)return result;
        List<Integer> level=new LinkedList<>();
        List<TreeNode> layer=new LinkedList<>();//当队列
        layer.add(root);
        layer.add(null);
        while(!layer.isEmpty()){
            TreeNode node=layer.remove(0);
            if(node==null){
                result.add(0,level);
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
