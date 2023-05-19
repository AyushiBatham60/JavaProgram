package src.String;

public class shortestPalin {
    public static void main(String[] args) {
        shortestPalin("forgeekkeegrof");
    }

    
    public  static  void shortestPalin(String s){
        int strt=s.length()-1;
        int end=s.length();
        String ans="";
        while (strt>=0){
            String substring=s.substring(strt,end);
            String revser="";
            int indx=substring.length()-1;
            while (indx>=0){
                revser+=substring.charAt(indx);
                indx--;
            }
            String checkstring=revser+s;
            if(isPalin(checkstring)) {

                ans = s.substring(0, strt+1);
            }
            strt--;
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
