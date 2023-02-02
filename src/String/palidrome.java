package src.String;

import java.util.Scanner;

public class palidrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(checkPalin_2(s));
    }
    public static boolean checkPalindrom(String s){
        boolean isPalin=false;
        int c=0;
        for (int i = 0; i < s.length(); i++) {
            int left=i-1;
            int right=i+1;
            isPalin=false;
            int count=0;
            while (left>=0 &&  right<s.length()){
                if(s.charAt(left)==s.charAt(right)){
                    left--;
                    right++;
                    isPalin=true;
                }
                else {
                    isPalin=false;
                    break;
                }
            }
            if(isPalin) {
                c=1;
               return true;
            }

        }
        return false;
    }
    public static boolean checkPalin_2(String s){
        int low=0;
        int high=s.length()-1;
        while (low<high){
            if(s.charAt(low)==s.charAt(high)){
                low++;
                high--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
