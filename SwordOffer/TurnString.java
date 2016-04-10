package com.magicwolf.niuke;
/**
 * 翻转单词顺序列
 * @author MagicWolf
 *
 */
public class TurnString {
    public static  String ReverseSentence(String str) {
        str=str.trim();
        if(str.equals(" ")||str==null) return "";
        String[] ss=str.split(" ");
        int length=ss.length;
        for(int i=0;i<length/2;i++){
            String temp=ss[i];
            ss[i]=ss[length-i-1];
            ss[length-i-1]=temp;
        }
        String result="";
        for (String s : ss) {
            result+=s+" ";
        }
        return result.substring(0, result.length()-1);
    }
    public static void main(String[] args) {
        System.out.println(ReverseSentence(" " ));
    }
}
