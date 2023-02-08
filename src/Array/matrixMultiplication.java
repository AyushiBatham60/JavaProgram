package src.Array;

import java.util.Arrays;

public class matrixMultiplication {

    public static void main(String[] args) {
        int[][] ar={{1,2,3},{4,5,6}};
        int[][] ar2={{1,4},{2,5},{3,6}};
        int[][] ans=multiply(ar,ar2);
        System.out.print('{');
        for (int i = 0; i <ans.length ; i++) {
            System.out.print('{');
            for (int j = 0; j <ans[0].length ; j++) {
                System.out.print(ans[i][j]+",");
            }
            System.out.print('}');
        }
        System.out.print('}');
    }

    public static int[][] multiply(int[][] arr1,int[][] arr2){
        if(arr1[0].length!=arr2.length){
            System.out.println("Multiplication cannot done on thses arrays");
        }
        int[][] ans=new int[arr1.length][arr2[0].length];
        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col <arr2[0].length ; col++) {
                int multiplication = 0;
                for (int k = 0; k < arr1[0].length; k++) {
                    multiplication = multiplication + (arr1[row][k] * arr2[k][col]);
                }
                ans[row][col]=multiplication;
            }
        }
        return  ans;
    }
}
