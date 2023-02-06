package src.String;

import java.util.Scanner;

public class toggle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        toggle(s,0,"");
    }
    public static void toggle(String s,int index,String ans){
        if(index==s.length()){
            System.out.println(ans);
            return;
        }
        char part=s.charAt(index);

       if((int)part>96){
           String sub=""+part;

           ans+=sub.toUpperCase();
       }
       else {
           String sub=""+part;
           ans+=sub.toLowerCase();
       }
       toggle(s,index+1,ans);
    }
}
