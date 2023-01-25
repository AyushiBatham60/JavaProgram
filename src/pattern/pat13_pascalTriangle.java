package src.pattern;

import java.util.Scanner;

public class pat13_pascalTriangle {
    /*
    input 4
       1
     1   1
   1   2   1
 1   3   3   1
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        pascalTriangle(sc.nextInt());
    }
    public static void pascalTriangle(int totalRows){
        int row=1;
        int noOFSpaces=totalRows-1;
        while (row<=totalRows){
            int combination=1;
            for (int spaces = 1; spaces <=noOFSpaces ; spaces++) {
                System.out.print(" "+" ");
            }
            for (int number = 1; number <=row ; number++) {
                System.out.print(" "+combination+" ");
                combination=combination*(row-number)/(number);
            }
            noOFSpaces--;
            row++;
            System.out.println();
        }
    }
}
