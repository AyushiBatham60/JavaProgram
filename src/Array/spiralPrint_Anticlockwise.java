package src.Array;

import java.util.Scanner;

public class spiralPrint_Anticlockwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        spiral_print(arr);
    }
    public static void spiral_print(int[][] arr){
        int count=1;
        int minRow=0;
        int minCol=0;
        int maxRow=arr.length-1;
        int maxCol =arr[0].length-1;
        while (count<=(arr.length*arr[0].length)){
            for (int row1 = minRow; row1 <=maxRow ; row1++) {
                System.out.print(arr[row1][minCol]+",");
                count++;
            }
            minCol++;
            for (int col1 = minCol; col1 <= maxCol; col1++) {
                System.out.print(arr[maxRow][col1]+",");
                count++;
            }
            maxRow--;
            for (int row2 = maxRow; row2 >=minRow ; row2--) {
                System.out.print(arr[row2][maxCol]+",");
                count++;
            }
            maxCol--;
            for (int col2 = maxCol; col2>=minCol ; col2--) {
                System.out.print(arr[minRow][col2]+",");
                count++;
            }
            minRow++;

        }
        System.out.println("END");
    }
}
