package com.magicwolf.sort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextInt()){
            int n=scanner.nextInt();
            int b=scanner.nextInt();
            System.out.println(numberGame(n, b));
        }
    }
    private static int numberGame(int n,int b){
        if(n<=1) return n;
        if(b==1) return 2;
        int result=b;
        for(int i=1;b-i>0;i+=2){
            if(b-i<result) result=b-i;
        }
        return result;
    }
}
