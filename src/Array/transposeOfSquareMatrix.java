package src.Array;

import java.util.Scanner;

public class transposeOfSquareMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] ar=new int[n][n];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j <ar.length ; j++) {
                ar[i][j]=sc.nextInt();
            }
        }
        transpose(ar);
    }
    public static void transpose(int[][] arr){
        int[][] ans=new int[arr.length][arr.length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                ans[j][i]=arr[i][j];
            }
        }
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j <ans.length ; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

}
