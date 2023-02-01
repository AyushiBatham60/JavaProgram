package src.Array;

import java.util.Arrays;
import java.util.Scanner;

public class calculateTheSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases =sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= sc.nextInt();
        }

        while (testcases >0){
            calculate(arr,sc.nextInt());
            System.out.println(Arrays.toString(arr));
            testcases--;
        }
    }
    public static void calculate(int[] array,int X){
        int[] copy=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i]=array[i];
        }
        for (int i = 0; i < array.length; i++) {
            int indx=i-X;
            if(indx<0){
                indx+=array.length;
            }
            array[i]=copy[i]+copy[indx];
        }
        for (int i = 0; i < array.length; i++) {
            copy[i]=array[i];
        }

    }
}
