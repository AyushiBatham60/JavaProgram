package src.Recursion;

public class lexicographically {

    public static void main(String[] args) {
        for (int i = 1; i <=9; i++) {
            lexicographcal_order(105,i);
        }

    }
    public static void lexicographcal_order(int n,int curr){
        if(curr>n){
            return;
        }
        System.out.println(curr);
        int initial=0;
        if(curr==0){
            initial=1;
        }
        for (int i = initial; i <=9 ; i++) {
            lexicographcal_order(n,curr*10+i);

        }
    }

}
