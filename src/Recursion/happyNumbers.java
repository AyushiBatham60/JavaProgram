package src.Recursion;

public class happyNumbers {

    public static void main(String[] args) {
        happynum("",2,-1);
    }
    public  static  void happynum(String curr,int n,int last){
        if(n==0){
            System.out.println(curr);
            return;
        }

        for (int i = last+1; i <=9 ; i++) {
            happynum(curr+i,n-1,i);
        }
    }
}
