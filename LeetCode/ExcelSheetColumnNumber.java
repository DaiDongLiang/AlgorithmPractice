package com.magicwolf.leetcode;


/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *   
 * @author MagicWolf
 *
 */
public class ExcelSheetColumnNumber {
    
    /**
     *  171. Excel Sheet Column Number
     *   A -> 1
     *   B -> 2
     *   C -> 3
     *   ...
     *   Z  -> 26
     *   AA -> 27
     *   AB -> 28 
     * @param s
     * @return
     */
    public static int titleToNumber(String s) {
        double result=0;
        int range=s.length()-1;
        for (int i = 0; i <=range; i++) {
            int num=s.charAt(i)-64;
            result+=(num*Math.pow(26, range-i));
        }
        return (int)result;
    }
    /**
     *  168. Excel Sheet Column Title
     *  1 -> A
     *  2 -> B
     *  3 -> C
     *  ...
     *  26 -> Z
     *  27 -> AA
     *  28 -> AB 
     * @param n
     * @return
     */
    public static String convertToTitle(int n) {
        String result="";
        for(;n!=0;n/=26){
            System.out.println("n:"+n);
            int reste=n%26;
            if(reste==0){
                result="Z"+result;
                n--;
            }else{
                result=(char)(reste+64)+result;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(titleToNumber("AAA"));
        System.out.println(convertToTitle(703));
    }
}
