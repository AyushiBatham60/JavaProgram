package src.Array;

import java.util.ArrayList;
import java.util.List;

public class permutations {

    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> result=new ArrayList<>();
        perm(nums,new boolean[nums.length+1],new ArrayList<>(),result);
        System.out.println(result);
    }
    public static void perm(int[] nums,boolean[] picked,List<Integer> temp,List<List<Integer>> ans){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!picked[i]){
                picked[i]=true;
                temp.add(nums[i]);
                perm(nums,picked,temp,ans);
                temp.remove(temp.size()-1);
                picked[i]=false;
            }
        }

    }
}
