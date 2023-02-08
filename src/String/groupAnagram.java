package src.String;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagram {

    public static void main(String[] args) {
        String[] str={"eat","tea","tan","ate","nat","bat"};
        HashMap<String,ArrayList<String>> dp=new HashMap<>();
        List<List<String>> ans=new ArrayList<>();
       groupAnagrams(str,ans);
        System.out.println(ans);
    }
    public static void groupAnagrams(String[] strs,List<List<String>> ans) {

        if(strs.length==0){
            List<String> temp=new ArrayList<>();
            ans.add(temp);
            return ;
        }
        for(int i=0;i<strs.length;i++){
            List<String> temp=new ArrayList<>();
            temp.add(strs[i]);
            if(strs[i]!="-1")
            {
                String ele=strs[i];
                for(int j=i+1;j<strs.length;j++){
                    if(isAnagram(ele,strs[j])){
                        temp.add(strs[j]);
                        strs[j]="-1";
                    }
                }
                ans.add(temp);
            }

        }

    }
    public static boolean isAnagram(String s1,String t1){
        if(s1.length()!=t1.length())return false;
        char[] s=s1.toCharArray();
        char[] t=t1.toCharArray();
        Arrays.sort(s);
        Arrays.sort(t);
        for(int i=0;i<s.length;i++){
            if(s[i]!=t[i]){
                return false;
            }
        }
        return true;
    }
}

