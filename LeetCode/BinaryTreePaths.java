package com.magicwolf.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a binary tree, return all root-to-leaf paths.

    For example, given the following binary tree:
       1
     /   \
    2     3
     \
      5
    All root-to-leaf paths are:
    
    ["1->2->5", "1->3"]
 * @author MagicWolf
 *
 */
public class BinaryTreePaths {
    public static List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> result=new ArrayList<>();
        if(root==null) return result;
        StringBuilder path=new StringBuilder();
        treePath(result,path, root);
        return result;
    }
    private static void treePath(ArrayList<String> result,StringBuilder path,TreeNode node){
        if(node==null)return;
        path.append(node.val+"->");
        if(node.left==null&&node.right==null){
            result.add(path.substring(0, path.lastIndexOf("->")));
        }else{
            treePath(result, path, node.left);
            treePath(result, path, node.right);
        }
        path.delete(path.lastIndexOf(node.val+"->"), path.length());
        return;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(binaryTreePaths(root));
    }
}
