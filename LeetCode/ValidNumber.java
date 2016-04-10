package com.magicwolf.leetcode;
/**
 * 65.ValidNumber
 *   Validate if a given string is numeric.
 *   Some examples:
 *   "0" => true
 *   " 0.1 " => true
 *   "abc" => false
 *   "1 a" => false
 *   "2e10" => true
 *   Note: It is intended for the problem statement to be ambiguous. You should gather all requirements up front before implementing one.
 * 
 * 
 * 
 * @author MagicWolf
 *
 */
public class ValidNumber {
    public  static boolean isNumber(String s) {
        s=s.trim();
        if(s.length()==0)return false;//如果是空字符
        boolean point=false,e=false;
        int size=s.length();
        for(int i=0;i<size;i++){
            char c=s.charAt(i);
            if(!(c>='0'&&c<='9'||c=='.'||c=='e'||c=='-'||c=='+')){
                return false;
            }
            if(c=='.'){
                if(point||e||!((i!=0 && (s.charAt(i-1)>='0' && s.charAt(i-1)<='9')) || (i!=s.length()-1 && (s.charAt(i+1)>='0' && s.charAt(i+1)<='9'))))return false;
                point=true;
                
            }
            if(c=='e'){
                if(e||i==size-1||i==0) return false;//如果e出现两次||e在开头或结尾
                e=true;
            }
            if(c=='-'||c=='+'){
                if(!((i==0||s.charAt(i-1)=='e'||s.charAt(i-1)=='E')&&i!=size-1&&(s.charAt(i+1)>='0'&&s.charAt(i+1)<='9'||s.charAt(i+1)=='.')))return false;
            }

        }
        return true;
    }
}
