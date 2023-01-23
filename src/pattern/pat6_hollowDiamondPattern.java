package src.pattern;

import java.util.Scanner;

public class pat6_hollowDiamondPattern {
    /*
     totalNumberOfRows(input) is odd number
     * * * * *
     * *   * *
     *       *
     * *   * *
     * * * * *
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        printPattern(sc.nextInt());
    }
    public static void printPattern(int totalRows){
        int row=2;
        for (int row1 = 1; row1 <=totalRows ; row1++) {
            System.out.print("* ");
        }
        System.out.println();
        int noOfStars=totalRows/2;
        int noOfSpaces=1;
        while (row<totalRows){
            for (int stars = 1; stars <=noOfStars ; stars++) {
                System.out.print("* ");
            }
            for (int spaces = 1; spaces <=noOfSpaces ; spaces++) {
                System.out.print("  ");
            }
            for (int stars = 1; stars <=noOfStars ; stars++) {
                System.out.print("* ");
            }
            if(row<=totalRows/2){
                noOfSpaces+=2;
                noOfStars--;
            }
            else{
                noOfSpaces-=2;
                noOfStars++;
            }
            row++;
            System.out.println();
        }

        for (int row1 = 1; row1 <=totalRows ; row1++) {
            System.out.print("* ");
        }

    }
}
