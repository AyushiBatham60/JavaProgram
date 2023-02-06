package src.String;

import java.util.HashMap;
import java.util.Scanner;

public class max_frequence_character {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        max_frequence(sc.next());
    }
    public static void max_frequence(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0;
        char result='.';
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else {
                map.put(s.charAt(i),1);
            }
            if(max<map.get(s.charAt(i))) {
                max = Math.max(max, map.get(s.charAt(i)));
                result=s.charAt(i);
            }
        }
        System.out.println(result);

    }
}
