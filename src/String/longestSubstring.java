package src.String;

public class longestSubstring {
    public static void main(String[] args) {
        longest("helloforgeekskeegrof");
    }
    public  static  void longest(String s){
        String ans="";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <=s.length(); j++) {
                String substring=s.substring(i,j);
                if(isPalin(substring)){
                    ans=ans.length()<substring.length()?substring:ans;
                }
            }
        }
        System.out.println(ans);
    }
    public  static  boolean isPalin(String s){
        int low=0;
        int high=s.length()-1;
        while (low<high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
