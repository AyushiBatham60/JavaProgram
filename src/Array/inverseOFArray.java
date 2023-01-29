package src.Array;

import java.util.Arrays;
import java.util.Scanner;

public class inverseOFArray {
    /*
    Swap element with index
 i/p:-0 2 4 1 3
 o/p-0 3 1 4 2
for eg : element 4 at index 2 becomes element 2 at index 4
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=sc.nextInt();
        }
        inverse(ar);
    }
    public static void inverse(int[] arr){
        int[] inverseArray=new int[arr.length];
        for (int i = 0; i <arr.length; i++) {
            inverseArray[arr[i]]=i;
        }
        for (int i = 0; i < inverseArray.length; i++) {
            System.out.print(inverseArray[i]+" ");
        }
    }
}
