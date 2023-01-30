package src.Array;

import java.util.Scanner;

public class maximum_subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int[] array={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximum_sum(array));
    }
    public static int maximum_sum(int[] arr){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];
            maxSum=Math.max(sum,maxSum);
            if(sum<0)sum=0;
        }
        return maxSum;
    }
}
