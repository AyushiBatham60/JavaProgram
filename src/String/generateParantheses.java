package src.String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class generateParantheses {
    public static void main(String args[]) {
        List<String> s=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        parant(n,0,0,"",s);
        System.out.println(s);
    }
    public static void parant(int n,int open,int close,String ans,List<String> s){
        if(open==n & close==n){
            s.add(ans);
            return ;
        }
        if(open <n){
            parant(n,open+1,close,ans+'(',s);
        }
        if(close<open &&close<n){
            parant(n,open,close+1,ans+')',s);
        }
    }

}
