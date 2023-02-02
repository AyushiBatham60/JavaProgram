package src.Recursion;

public class rec_intro {
    public static void main(String[] args) {

        System.out.println(fibnocci(4));
    }
    public static void print_dec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print_dec(n-1);
    }
    public static void print_inc(int n){
        if(n==0){
            return;
        }
        print_inc(n-1);
        System.out.println(n);
    }
    public static int power(int x,int n){
        if(n==1){
            return x;
        }
        return x*power(x,n-1);
    }
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static int fibnocci(int n){
        if(n<=1){

            return 0;
        }
        if(n==2){

            return 1;
        }
        int a=fibnocci(n-1)+fibnocci(n-2);

        return a;
    }

}
