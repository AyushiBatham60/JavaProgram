package src.Array;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] array={-1,2,1,-4};
        System.out.println(threeSumClosest(array,1));

    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest=0;
        int minDiff=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;

            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target){
                    return sum;
                }
                else if(sum>target){
                    k--;
                }
                else{
                    j++;
                }
                int diff=Math.abs(sum-target);
                if(diff<minDiff){
                    minDiff=diff;
                    closest=sum;
                }
            }
        }
        return closest;
    }
}
