package com.magicwolf.swordoffer;


/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * 
 * @author MagicWolf
 * 
 */
public class StringReplace {
    public static String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll(" ", "%20");
//        String[] ss=string.split(" ");
//        StringBuilder sb=new StringBuilder();
//        for(int i=0;i<ss.length-1;i++){
//            sb.append(ss[i]+"%20");
//        }
//        sb.append(ss[ss.length]);
//        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("We Are Happy")));
    }
}
