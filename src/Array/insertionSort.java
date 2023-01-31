package src.Array;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] ar={12, 11, 13, 5, 6};
        insertion(ar);
        System.out.println(Arrays.toString(ar));
    }
    public static void insertion(int[] ar){
        for (int i = 1; i < ar.length; i++) {
            int j=i-1;
            int ele=ar[i];
            while (j>=0 && ar[j]>ele){
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=ele;
        }
    }
}
