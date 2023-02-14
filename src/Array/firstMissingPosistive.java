package src.Array;

import java.util.Arrays;

public class firstMissingPosistive {
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==c){
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] ar={3,4,-1,1};
        System.out.println(firstMissingPositive(ar));
    }
}
