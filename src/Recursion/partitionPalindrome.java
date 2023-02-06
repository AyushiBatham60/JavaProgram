package src.Recursion;

import java.util.ArrayList;
import java.util.List;

public class partitionPalindrome {

    public static void main(String[] args) {
        List<List<String>> result=new ArrayList<>();
        part("nitin",new ArrayList<>(),result);
        System.out.println(result);
    }

    public static void part(String s,List<String> al,List<List<String>> ans){
        if(s.isEmpty()){
            ans.add(new ArrayList<>(al));
        }
        for(int i=0;i<s.length();i++){
            String chopped=s.substring(0,i+1);
            String rem=s.substring(i+1);
            if(palin(chopped))
            {
                al.add(chopped);
                part(rem,al,ans);
                al.remove(al.size()-1);
            }
        }
    }
    public static boolean palin(String s){
        int l=0;
        int h=s.length()-1;
        while(l<h){
            if(s.charAt(l)!=s.charAt(h)){
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
}
