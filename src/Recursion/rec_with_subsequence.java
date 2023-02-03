package src.Recursion;

import java.awt.*;

public class rec_with_subsequence {

    public static void main(String[] args) {
        subsequence_with_Ascii("abc","");
    }
    public static void subsequence(String s,String ans){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        subsequence(s.substring(1),ans+s.charAt(0));
        subsequence(s.substring(1),ans);
    }
    public static void subsequence_with_Ascii(String s, String ans){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        subsequence_with_Ascii(s.substring(1),ans+s.charAt(0)+(int)s.charAt(0));
        subsequence_with_Ascii(s.substring(1),ans);
    }

}
