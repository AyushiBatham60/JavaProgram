package src.Array;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int count=0;
        int minRow=0;
        int maxRow=matrix.length-1;
        int minCol=0;
        List<Integer> l=new ArrayList<>();
        int maxCol=matrix[0].length-1;
        while(count<matrix.length*matrix[0].length){
            for(int i=minCol;i<=maxCol;i++){
                l.add(matrix[minRow][i]);
                count++;
            }
            minRow++;
            for(int i=minRow;i<=maxRow;i++){
                l.add(matrix[i][maxCol]);
                count++;
            }
            maxCol--;
            if(count<matrix.length*matrix[0].length)
            {for(int i=maxCol;i>=minCol;i--){
                l.add(matrix[maxRow][i]);
                count++;
            }}
            maxRow--;
            if(count<matrix.length*matrix[0].length)
            {for(int i=maxRow;i>=minRow;i--){
                l.add(matrix[i][minCol]);
                count++;
            }}
            minCol++;
        }
        return l;
    }
}
