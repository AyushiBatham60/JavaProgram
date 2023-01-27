package src.Array;

import java.util.Scanner;

public class simpleHCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] ar=new int[N];
        for (int i = 0; i <ar.length; i++) {
            ar[i]=sc.nextInt();
        }
        System.out.println(findHCF(ar));
    }
    public static int findHCF(int[] arr){
        int hcf=1;
        for (int i = 2; i <=10 ; i++) {
            int c=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]%i==0){
                    c++;
                }
            }
            if(c== arr.length){
                hcf=i;
            }
        }
        return  hcf;
    }
}
