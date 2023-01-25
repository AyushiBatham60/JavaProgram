package src.Array;

import java.util.Scanner;

public class maximumCircularSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]=sc.nextInt();
        }
        System.out.println(maxCircularSum(ar));
    }
    public static int maxCircularSum(int[] arr){
        int sum1=kadanesAlgo(arr);
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            arr[i]=-1*arr[i];
        }
        int sum2=sum+kadanesAlgo(arr);
        int max=Math.max(sum1,sum2);
        return max;
    }
    public static int kadanesAlgo(int[] arr){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(maxSum<sum) maxSum=sum;
            if(sum<0)sum=0;
        }
        return  maxSum;
    }
}
