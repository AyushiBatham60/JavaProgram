package src.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class merge_sorted_array {
    public static void main(String[] args) {
        int[] num1={1,2,3,0,0,0};
        int[] num2={2,5,6};
        merge_sorted_array(num1,3,num2,3);
    }
    public static void merge_sorted_array(int[] num1,int m,int[] num2,int n){
        int[] ans=new int[m+n];

        for (int i = 0; i <m; i++) {
            ans[i]=num1[i];
        }
        for (int i = 0; i < m; i++) {
            ans[i+m]=num2[i];
        }
        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));
    }
}
