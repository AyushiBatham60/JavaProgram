package src.String;

public class printReverse {
    public static void main(String[] args) {
        System.out.println(reverse_of_sentence("The Sky is blue"));

    }
    public static String reverse_of_sentence(String s){
        String rev="";
        String ans="";
        for (int i = s.length()-1; i >=0 ; i--) {
            if(s.charAt(i)!=' '){
                rev=s.charAt(i)+rev;
            }
            else {
                if(ans.isEmpty()){

                    ans+=rev.substring(0,1).toUpperCase()+rev.substring(1);
                }else {
                    ans = ans + " " + rev.toLowerCase();

                }rev = "";

            }
        }
        ans=ans+" "+rev.toLowerCase();
        return ans;
    }
}
