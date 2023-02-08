package src.Array;

import java.util.Arrays;

public class arrayProductExceptSelf {

    public static void main(String[] args) {
        int[] ar={1,2,3,4,5};
        product(ar,0,new int[ar.length]);
    }
    public static void product(int[] arr,int index,int[] ans){
        if(index==arr.length){
            System.out.println(Arrays.toString(ans));
            return;
        }

        int product =1;
        for (int i = 0; i < arr.length; i++) {
            if(i!=index) {
                product *= arr[i];
            }
        }

        ans[index]= product;
        product(arr,index+1,ans);

    }
}
