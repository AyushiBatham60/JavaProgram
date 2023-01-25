package src.pattern;

import java.util.Scanner;

public class pat13_downwardPattern {
    /*
    * * * * * *
     * * * * *
      * * * *
       * * *
        * *
         *
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        downwardPattern(sc.nextInt());
    }
    public static void downwardPattern(int totalRows){
        int row=totalRows;
        int noOFSpaces=0;
        while (row>=1){
            for (int spaces = 1; spaces <=noOFSpaces; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <=row ; stars++) {
                System.out.print("* ");
            }
            row--;
            noOFSpaces++;
            System.out.println();
        }
    }
}
