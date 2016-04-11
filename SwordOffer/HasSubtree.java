package com.magicwolf.swordoffer;

public class HasSubtree {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root2==null) return true;
        if(root1==null|| root2==null) return false;
        TreeNode root=findSubRoot(root1, root2.val);
        if(root==null) return false;
        if(isSub(root, root2)) 
            return true;
        else 
            return HasSubtree(root1.left, root2)||HasSubtree(root1.right, root2);
    }
    public TreeNode findSubRoot(TreeNode node,int val){
        if(node==null) return null;
        if(node.val==val) return node;
        TreeNode n=findSubRoot(node.left, val);
        return n==null?findSubRoot(node.right, val):n;
    }
    private boolean isSub(TreeNode root1,TreeNode root2){
        if(root2==null) return true;
        if(root1==null) return false;
        if(root1.val!=root2.val) return false;
        return isSub(root1.left, root2.left)&&isSub(root1.right, root2.right);
    }
    public static void main(String[] args) {
        HasSubtree h=new HasSubtree();
        TreeNode root1=new TreeNode(8);
        root1.right=new TreeNode(8);
        root1.right.right=new TreeNode(9);
        TreeNode root2=new TreeNode(8);
        root2.left=new TreeNode(3);
        root2.right=new TreeNode(9);
        System.out.println(h.HasSubtree(root1, root2));
    }
}
