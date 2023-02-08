package src.Array;

import java.util.Arrays;

public class lowerBound {

    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,4,5,6,7,8};
        System.out.println(findIndex(arr,2));
    }
    public static int findIndex(int[] arr,int ele){
        int l=0;
        int h=arr.length-1;
        int ansIndex=-1;
        Arrays.sort(arr);
        while (l<h){
            int mid=(l+h)/2;
            if(arr[mid]<ele){
                l=mid+1;
            }
            else if(arr[mid]>ele){
                h=mid-1;
            }
            else if(arr[mid]==ele){
                ansIndex=mid;
                h=mid-1;
            }
        }
        return ansIndex;
    }
}
