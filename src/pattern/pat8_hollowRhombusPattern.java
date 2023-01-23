package src.pattern;

import java.util.Scanner;

public class pat8_hollowRhombusPattern {

    /*
     For any input N.
     First line contains 4 space and then 5 {*} and then the second line contains according to the output format.
       *****
      *   *
     *   *
    *   *
   *****
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        hollowRhombus(sc.nextInt());
    }
    public static void hollowRhombus(int totalRows){
        int noOFSpacesOutside=totalRows-1;
        int noOFSpaces2=totalRows-2;
        int row=1;
        while (row<=totalRows){
            for (int spaces = 1; spaces <=noOFSpacesOutside ; spaces++) {
                System.out.print(" ");
            }
            if(row==1 || row==totalRows){
                for (int starts = 1; starts <=totalRows ; starts++) {
                    System.out.print("*");
                }
            }
            else {
                System.out.print("*");
                for (int spaces2 = 1; spaces2 <=noOFSpaces2; spaces2++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
            row++;
            noOFSpacesOutside--;

        }
    }
}
