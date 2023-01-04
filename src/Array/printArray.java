package src.Array;

import java.util.Arrays;
import java.util.Scanner;

public class printArray {
    public static void main(String[] args) {
        int[] array=new int[5];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }

}
