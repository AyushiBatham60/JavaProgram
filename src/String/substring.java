package src.String;

import java.util.Scanner;

public class substring {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        print_palin_substring(s);
    }
    public static void print_substring(String str){
        int count=0;
        for (int i = 0; i <str.length(); i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                System.out.println(str.substring(i,j+1));
                count++;
            }
            System.out.println("-----");
        }
        System.out.println("Total substring: "+count);
    }
    public static void print_palin_substring(String s){
        System.out.println("Palindrome Substrings");
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <=s.length() ; j++) {
                String substring=s.substring(i,j);
                if(checkPalin(substring)){
                    System.out.println(substring);
                }

            }
        }
    }
    public static boolean checkPalin(String s){
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
