package src.Array;

import java.util.Arrays;
import java.util.Scanner;

public class two_arrays_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] ar1=new int[n];

        for (int i = 0; i < n; i++) {
            ar1[i]=sc.nextInt();
        }int m=sc.nextInt();
        int[] ar2=new int[m];
        for (int i = 0; i < m; i++) {
            ar2[i]=sc.nextInt();
        }
        two_array_sum(ar1,ar2);
    }
    public static void two_array_sum(int[] arr1,int[] arr2){
        int len=arr1.length>arr2.length?arr1.length:arr2.length;
        int[] ans=new int[len+1];
        int a=ans.length-1;
        int p1=arr1.length-1;
        int p2=arr2.length-1;
        int carry=0;
        Arrays.fill(ans,-1);
        while (p1>=0 && p2>=0){
            int sum=arr1[p1]+arr2[p2]+carry;

            carry=sum/10;
            sum=sum%10;
            ans[a]=sum;

            p1--;
            p2--;
            a--;
        }

        if(p1==0) {
            while (p1 >=0) {
                int sum = arr1[p1] + carry;
                carry = sum / 10;
                sum = sum % 10;
                ans[a] = sum;
                a--;
                p1--;

            }
        }
        if(p2==0) {
            while (p2 >=0) {
                int sum = arr2[p2] + carry;
                carry = sum / 10;
                sum = sum % 10;
                ans[a] = sum;
                a--;
                p2--;

            }
        }
        if(carry!=0){
            ans[a]=carry;
        }
        for (int i = 0; i <ans.length ; i++) {
            if(ans[i]!=-1) System.out.print(ans[i]+",");
        }
        System.out.print("END");

    }
}
