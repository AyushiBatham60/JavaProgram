package src.Array;

import java.util.ArrayList;
import java.util.List;

public class permutation2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        perm(nums,new boolean[nums.length+1],new ArrayList<>(),res);
        return res;
    }
    public static void perm(int[] nums,boolean[] visited,List<Integer> temp,List<List<Integer>> ans){
        if(temp.size()==nums.length){
            if(!ans.contains(temp))
                ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                visited[i]=true;
                temp.add(nums[i]);
                perm(nums,visited,temp,ans);
                temp.remove(temp.size()-1);
                visited[i]=false;
            }
        }
    }
}
