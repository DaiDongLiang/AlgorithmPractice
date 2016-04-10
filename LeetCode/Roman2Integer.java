package com.magicwolf.leetcode;

/**
 * Given a roman numeral, convert it to an integer.
 * 
 * @author MagicWolf
 * 
 */
public class Roman2Integer {
    public static int romanToInt(String s) {
        if(null==s) return 0;
        char[] chars=s.toCharArray();
        int size=chars.length;
        if(size==1) return getNum(chars[0]);
        int result=0;
        for(int i=0;i<=size-1;i++){
            if(i==size-1){
                result+=getNum(chars[i]);
                break;
            }else{
                int before=getNum(chars[i]);
                int after=getNum(chars[i+1]);
                if(before<after){
                    result+=(after-before);
                    i++;
                }else{
                    result+=before;
                }
                
            }
        }
        return result;
    }
    public static int getNum(char c){
        switch (c) {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        default:
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCVI"));
    }
}
