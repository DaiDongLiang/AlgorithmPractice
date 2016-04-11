package com.magicwolf.swordoffer;

import java.util.Scanner;

public class BatteryAttack {
    private static double distance(int x1,int y1,int x2,int y2){
        return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2), 2));
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextInt()){
            int harm=0;
            int max=scanner.nextInt();
            int x1=scanner.nextInt();
            int y1=scanner.nextInt();
            int x2=scanner.nextInt();
            int y2=scanner.nextInt();
            int x3=scanner.nextInt();
            int y3=scanner.nextInt();
            int x0=scanner.nextInt();
            int y0=scanner.nextInt();
            if(distance(x1, y1, x0, y0)<=max) harm++;
            if(distance(x2, y2, x0, y0)<=max) harm++;
            if(distance(x3, y3, x0, y0)<=max) harm++;
            System.out.println(harm+"x");
        }
    }
}
