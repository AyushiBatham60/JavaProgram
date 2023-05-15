package src.Recursion;

public class inc_n_dec {
    public static void main(String[] args) {
        iinc_n_Dec("",2,-1);
    }
    public  static  void iinc_n_Dec(String curr, int n, int last){
        if(n==0){
            System.out.println(curr);
            return;
        }

        for (int i = last+1; i <=9 ; i++) {
            iinc_n_Dec(curr+i,n-1,i);
        }
    }
}
