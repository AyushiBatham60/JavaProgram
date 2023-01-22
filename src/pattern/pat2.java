package src.pattern;

import java.util.Scanner;

public class pat2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern_02(n);
    }
    public static void pattern_01(int n){
        for (int row=n;row>=1;row--){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern_02(int n){
        int noOfSpace=0;
        int noOfStar=n;
        int row=n;
        while(row>=1){
            for (int spaces=1;spaces<=noOfSpace;spaces++){
                System.out.print("  ");
            }
            for (int stars=1;stars<=noOfStar;stars++){
                System.out.print("* ");
            }
            noOfStar--;
            noOfSpace++;
            row--;
            System.out.println(4);
        }
    }
}
