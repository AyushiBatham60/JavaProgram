package src.Array;

import java.util.*;

public class findAllDuplicates {
    public static void main(String[] args) {
        int[] ar={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(ar));
    }
    public static  List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> al=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            al.add(nums[i]);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!al.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
