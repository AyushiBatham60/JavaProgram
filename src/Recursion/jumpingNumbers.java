package src.Recursion;

public class jumpingNumbers {
    //jumpingNumbers are those number whose consecutive number difference is 1
    public static void main(String[] args) {
        jump(1000,0);
    }
    public static void jump(int n,int curr){
        if(curr>n){
            return;
        }
        System.out.println(curr);
        if(curr==0){
            for (int i = 1; i <=9 ; i++) {
                jump(n,i);
            }
        }

        int lastDigit=curr%10;
        if(lastDigit!=0){
            jump(n,curr*10+(lastDigit-1));
        }
        if(lastDigit!=9){
            jump(n,curr*10+(lastDigit+1));
        }

    }

}
