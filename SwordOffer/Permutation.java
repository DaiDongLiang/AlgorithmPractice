package com.magicwolf.niuke;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,
 * bca,cab和cba。 结果请按字母顺序输出。
 * 
 * @author MagicWolf
 * 
 */
public class Permutation {
    public static  ArrayList<String> Permutation(String str) {
        if(str==null) return new ArrayList<>();
        Set<String> set=new TreeSet<>();
        permutation(set,str.toCharArray(), 0,str.length()-1);
        return new ArrayList<>(set);
    }
    private static void permutation(Set<String> list,char[] chars,int low,int high){
        if(low==high){
            list.add(new String(chars));
        }else{
            for(int i=low;i<=high;i++){
                char tmp=chars[low];
                chars[low]=chars[i];
                chars[i]=tmp;
                permutation(list, chars, low+1, high);
                tmp=chars[low];
                chars[low]=chars[i];
                chars[i]=tmp;
            }
        }
    }
    private static char[] toCharArray(Character[] c){
        char[] chars=new char[c.length];
        for (int i = 0; i < c.length; i++) {
            chars[i]=c[i];
        }
        return chars;
    }
    public static void main(String[] args) {
        System.out.println(Permutation("aa"));
    }
}
