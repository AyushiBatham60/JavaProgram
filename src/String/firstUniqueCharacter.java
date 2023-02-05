package src.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class firstUniqueCharacter {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("ayushia"));
    }
    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> al=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(al.containsKey(s.charAt(i))){
                al.put(s.charAt(i),al.get(s.charAt(i))+1);
            }
            else{
                al.put(s.charAt(i),1);
            }
        }
        for (int i = 0; i <s.length() ; i++) {
            if(al.get(s.charAt(i))==1){
                return  i;
            }
        }
        return -1;
    }
}
