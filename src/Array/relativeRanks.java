package src.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class relativeRanks {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(findRelativeRanks(arr)));
    }

    public static String[] findRelativeRanks(int[] score) {
        String[] ans=new String[score.length];
        int[] copy=new int[ans.length];
        for(int i=0;i<ans.length;i++){
            copy[i]=score[i];
        }
        Arrays.sort(copy);
        Map<Integer,String> map=new HashMap<>();
        int c=ans.length;
        for(int i=0;i<score.length;i++){
            if(i==score.length-3){
                map.put(copy[i],"Bronze Medal");
            }
            else if(i==score.length-2){
                map.put(copy[i],"Silver Medal");
            }
            else if( i==score.length-1){
                map.put(copy[i],"Gold Medal");
            }
            else{
                String valuee=""+c;
                map.put(copy[i],valuee);
                c--;
            }
        }
        for(int i=0;i<score.length;i++){
            ans[i]=map.get(score[i]);
        }
        return ans;
    }
}
