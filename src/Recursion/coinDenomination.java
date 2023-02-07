package src.Recursion;

import java.util.ArrayList;
import java.util.List;

public class coinDenomination {
    public static void main(String[] args) {
        int[] coins={2,3,5,7};
        List<List<Integer>> result=new ArrayList<>();
       coinDenomination2(coins,10,new ArrayList<>(),0,result);
        System.out.println(result);
    }
    public static void coinDenomination(int[] coins,int Amount,int index,List<Integer> al,List<List<Integer>> ans){
        if(index==coins.length || Amount<0){

            return;
        }
        if(Amount==0){
            ans.add(new ArrayList<>(al));
        }


        al.add(coins[index]);
        coinDenomination(coins,Amount-coins[index],index+1,al,ans);
        al.remove(al.size()-1);
        coinDenomination(coins,Amount,index+1,al,ans);

    }
    public static void coinDenomination2(int[] coins,int Amount,List<Integer> al,int index,List<List<Integer>> ans){

        if(Amount==0){
            ans.add(new ArrayList<>(al));
            return;
        }
        if(Amount<0 || index==coins.length){
            return;
        }

        for (int i = 0; i < coins.length; i++) {
            al.add(coins[i]);
            coinDenomination2(coins,Amount-coins[i],al,i,ans);
            al.remove(al.size()-1);
        }
    }
}
