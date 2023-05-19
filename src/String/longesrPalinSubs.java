package src.String;

public class longesrPalinSubs {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abab"));
    }
    public static String longestPalindrome(String str) {
        int s=0,e=0;
        int len=0;
        for(int i=0;i<str.length();i++){
            int odd=palin(str,i,i);
            int even=palin(str,i,i+1);
            len=Math.max(odd,even);

            if(len>e-s){
                s=i-(len-1)/2;
                e=i+len/2;
            }
        }
        return str.substring(s,e+1);
    }
    public static int palin(String st,int s,int e){
        while(s>=0 && e<st.length() && st.charAt(s)==st.charAt(e)){
            s--;
            e++;
        }
        return e-s-1;
    }
}
