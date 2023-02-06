package src.String;

import java.util.Arrays;
import java.util.Scanner;

//A Good String is a string which contains only vowels (a,e,i,o,u) .
// Given a string S, print a single positive integer N where N is the length of the longest substring of S that is also a Good String.
public class PlayingwithGoodStrings {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(play(s));
    }
    public static int play(String s){
        int max=0;
        int[] dp=new int[s.length()+1];
        Arrays.fill(dp,-1);
        for (int i=0;i<s.length();i++){
            if(dp[i]!=-1){
                max=Math.max(dp[i],max);
            }
            else {
                for (int j = i + 1; j < s.length(); j++) {
                    String subPart = s.substring(i, j);
                    if (goodString(subPart)) {
                        max = Math.max(max, subPart.length());
                    }

                }
                dp[i]=max;
            }
        }
        return max;
    }
    public static boolean goodString(String s){
        int l=0;
        int h=s.length()-1;
        while (l<h){
            char ch1=s.charAt(l);
            char ch2=s.charAt(h);

            if ((ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u') && (ch2=='a' || ch2=='e' || ch2=='i' || ch2 =='o'  || ch2=='u')){
                l++;
                h--;
            }
            else {
                return false;
            }

        }
        return true;
    }

}
