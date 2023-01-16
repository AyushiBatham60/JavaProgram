package src.String;

import java.util.Arrays;

public class longestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()+1][text2.length()+1];
        for(int[] val:dp){
            Arrays.fill(val,-1);
        }
        return longestCommonSubsequence(text1,text2,0,0,dp);
    }
    public static int longestCommonSubsequence(String s1,String s2,int i1,int i2,int[][] dp){
        if(i1==s1.length()|| i2==s2.length()) return 0;

        if(dp[i1][i2]!=-1){
            return dp[i1][i2];
        }

        if(s1.charAt(i1)==s2.charAt(i2)){
            return dp[i1][i2]=1+longestCommonSubsequence(s1,s2,i1+1,i2+1,dp);
        }

        int way1=longestCommonSubsequence(s1,s2,i1+1,i2,dp);
        int way2=longestCommonSubsequence(s1,s2,i1,i2+1,dp);
        return dp[i1][i2]=Math.max(way1,way2);
    }
}
