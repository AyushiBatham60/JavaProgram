package src.Array;

public class findMinimumInRotatedArray {
    public static void main(String[] args) {
        int [] num={3,4,5,1,2};
        System.out.println(findMin(num));
    }
    public static  int findMin(int[] nums) {
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(min>nums[i]) min=nums[i];
        }
        return min;
    }
}
