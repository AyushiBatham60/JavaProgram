package src.Array;

public class searchInSortedArray {
    public static void main(String[] args) {
        int[] num={4,5,6,7,0,1,2};
        int target=7;
        System.out.println(search(num,target));
    }
    public static int search(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)return i;
        }
        return -1;
    }
}
