package src.Recursion;

public class coinCombination {
    //no two consecutive head allowed

    public static void main(String[] args) {
        combination(3,false,"");
    }

    public static void combination(int n,boolean isHead,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }

        if(n<0){
            return;
        }

        if(!isHead)
        combination(n-1,true,ans+"H");
        combination(n-1,false,ans+"T");

    }
}
