package com.magicwolf.niuke;



/**
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 * @author MagicWolf
 *
 */
public class SerializeTree {
    String Serialize(TreeNode root) {
        if(root==null) return null;
        StringBuilder sb=new StringBuilder();
        serialize(sb, root);
        return sb.toString();
    }
    private void serialize(StringBuilder sb,TreeNode node){
        if(node==null) {
            sb.append("#"+",");
            return;
        }
        sb.append(node.val+",");
        serialize(sb, node.left);
        serialize(sb, node.right);
    }
    TreeNode Deserialize(String str) {
        if(str==null||str.equals("#"))return null;
        String[] vals=str.split(",");
        TreeNode root=new TreeNode(0);
        deserial(vals, 0, root);
        return root;
    }
    private int deserial(String[] vals,int index,TreeNode node){
        if(index>=vals.length||vals[index].equals("#")) return index;
        node.val=Integer.valueOf(vals[index]);
        if(!vals[++index].equals("#")){
            node.left=new TreeNode(0);
            index=deserial(vals, index, node.left);
        }
        if(!vals[++index].equals("#")){
            node.right=new TreeNode(0);
            index=deserial(vals, index, node.right);
        }
        return index;
    }
    public void print(TreeNode node){
        if(node==null){
            System.out.print("#,");
            return;
        }
        System.out.print(node.val+",");
        print(node.left);
        print(node.right);
    }
    public static void main(String[] args) {
        SerializeTree st=new SerializeTree();
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(4);
        root.right=new  TreeNode(5);
        String str=st.Serialize(null);
        System.out.println(str);
        TreeNode root2=st.Deserialize(str);
        st.print(root2);
    }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}