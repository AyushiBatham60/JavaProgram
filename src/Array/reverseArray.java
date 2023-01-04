package src.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] array=new int[]{12,34,67,87};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
    //inplace reverse
    public static void reverse(int[] arr){
        int li=0;
        int hi=arr.length-1;
        while (li<hi){
            swap(arr,li,hi);
            li++;
            hi--;
        }
    }
    public static void swap(int[] array,int index1,int index2){
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
}
