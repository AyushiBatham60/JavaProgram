package src.pattern;

import java.util.Scanner;

public class pat7_patternMountain {
    /*
                       input is 4
                       1           1
                       1 2       2 1
                       1 2 3   3 2 1
                       1 2 3 4 3 2 1
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        printMountains(sc.nextInt());
    }
    public static void printMountains(int totalRows){
        int row=1;
        int noOfSpaces=totalRows+1;
        int noOfDigit=1;
        while (row<=totalRows){

            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            for (int spaces = 1; spaces <=noOfSpaces; spaces++) {
                System.out.print(" "+" ");
            }
            if(row<totalRows){
                noOfDigit=row;
            }
            else {
                noOfDigit=row-1;
            }
            for (int col = noOfDigit; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            System.out.println();
            noOfSpaces-=2;
            row++;
        }

    }

}
