package src.Recursion;

public class climbingStairs {

    public static void main(String[] args) {
        climbing(5,"");
    }
    public static void climbing(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(n<0){
            return;
        }

        climbing(n-1,ans+"1 ");
        climbing(n-2,ans+"2 ");
        climbing(n-3,ans+"3 ");

    }
}
