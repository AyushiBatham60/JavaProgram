package src.Array;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] ar={64,25,12,22,11};
        selectionSort(ar);
        System.out.println(Arrays.toString(ar));
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int ele=arr[i];
            int indx=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[indx]){
                    indx=j;
                }

            }
            swap(arr,i,indx);
        }
    }
    public static void swap(int[] ar,int i,int j){
        int tmp=ar[i];
        ar[i]=ar[j];
        ar[j]=tmp;
    }
}
