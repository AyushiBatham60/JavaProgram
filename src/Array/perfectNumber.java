package src.Array;

import java.util.Scanner;

public class perfectNumber {
    //A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.
    // A divisor of an integer x is an integer that can divide x evenly.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(checkPerfectNumber(sc.nextInt()));
    }
    public static boolean checkPerfectNumber(int num) {
        int range=num/2;
        int sum=0;
        for(int i=1;i<=range;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num) return true;
        return false;
    }
}

