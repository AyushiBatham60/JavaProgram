package src.Array;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int n=1011;
        String copy=Integer.toString(n);
        StringBuilder input1 = new StringBuilder();
        input1.append(copy);
        input1.reverse();
        System.out.println(Integer.parseInt(input1.toString(),2));
        rotate_method_1(arr,4);
        System.out.println(Arrays.toString(arr));

        int[] arr2={10,20,30,40,50,60};
        rotate_method_2(arr2,4);
        System.out.println(Arrays.toString(arr2));
    }
    //o(n*n) complexity
    public static void rotate_method_1(int[] arr,int ktime){
        ktime=ktime%arr.length;
        for (int j = 1; j <=ktime; j++) {
            int temp=arr[arr.length-1];
            for (int i = arr.length-1; i >=1; i--) {
                arr[i]=arr[i-1];
            }
            arr[0]=temp;
        }

    }
    public static void rotate_method_2(int[] arr,int ktime){
        ktime=ktime%arr.length;
        reverse(arr,0, arr.length-ktime-1);
        reverse(arr,arr.length-ktime,arr.length-1);

        reverse(arr,0,arr.length-1);
    }
    public static void reverse(int[] arr,int start,int end){
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

}
