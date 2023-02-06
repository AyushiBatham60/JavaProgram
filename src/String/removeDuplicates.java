package src.String;

import java.util.HashMap;
import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        remove(sc.next());
    }
    public static void remove(String s){
        int i=0;
        while (i<s.length()-1){
            int j=i+1;
            char curr=s.charAt(i);
            char nextEle=s.charAt(j);
            while (curr==nextEle && j<s.length()){
                s=s.substring(0,i+1)+s.substring(j+1);
                nextEle=s.charAt(i+1);
            }
            i++;
        }
        System.out.println(s);
    }
}