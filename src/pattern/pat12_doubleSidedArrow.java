package src.pattern;

import java.util.Scanner;

public class pat12_doubleSidedArrow {
    /*
Take N as input. For a value of N=7, we wish to draw the following pattern :

                            1
                        2 1   1 2
                    3 2 1       1 2 3
                4 3 2 1           1 2 3 4
                    3 2 1       1 2 3
                        2 1   1 2
                            1
 */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        doubleSidedArrow(sc.nextInt());
    }
    public static void doubleSidedArrow(int totalRows){

        int noOFSpaces=totalRows-1;
        int row=1;
        int count=1;
        int innerSpace=0;
        while (row<=totalRows){
            for (int spaces = 1; spaces <=noOFSpaces ; spaces++) {
                System.out.print(" "+" ");
            }

            for (int digits = count; digits >=1 ; digits--) {
                System.out.print(digits+" ");
            }
            for (int spaces2 = 1; spaces2 <=innerSpace; spaces2++) {
                System.out.print(" "+" ");
            }
            if(row!=1 && row!=totalRows) {
                for (int digits2 = 1; digits2 <= count; digits2++) {
                    System.out.print(digits2 + " ");
                }
            }
            if(row<=totalRows/2){
                noOFSpaces-=2;
               count++;
               if(row!=1) {
                   innerSpace += 2;
               }
               else{
                   innerSpace++;
               }

            }
            else{
                noOFSpaces+=2;
                count--;
                if(row!=totalRows-1) {
                    innerSpace -= 2;
                }
                else innerSpace--;
            }
            row++;
            System.out.println();
        }
    }
}
