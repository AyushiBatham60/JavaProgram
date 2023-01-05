package src.Array;

import java.util.Arrays;

public class findFirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int[] ans=searchRange(arr,8);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;
        int[] arr=new int[2];
        Arrays.fill(arr,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(arr[0]==-1){
                    arr[0]=i;
                    arr[1]=i;
                }
                else{
                    arr[1]=i;
                }
            }
        }
        return arr;

    }
}
