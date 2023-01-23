package src.pattern;

import java.util.Scanner;

public class pat5_mirrorStarPattern {

    /*
           *
        *  *  *
     *  *  *  *  *
        *  *  *
           *
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        print_mirror(sc.nextInt());
    }
    public static void print_mirror(int totalrows){
        int row=1;
        int noOfStars=1;
        int noOfspace=totalrows/2;
        while (row<=totalrows){
            for (int spaces = 1; spaces <=noOfspace ; spaces++) {
                System.out.print(" "+"  ");
            }
            for (int starts = 1; starts <=noOfStars ; starts++) {
                System.out.print("*"+"  ");
            }
            if(row<totalrows/2+1) {
                noOfspace--;
                noOfStars+=2;
            }
            else {
                noOfspace++;
                noOfStars-=2;
            }
            System.out.println();
            row++;
        }
    }
}
