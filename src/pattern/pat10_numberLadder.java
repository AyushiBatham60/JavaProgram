package src.pattern;

import java.util.Scanner;

public class pat10_numberLadder {
    /*
1
2	3
4	5	6
7	8	9	10
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        patternNumberLadder(sc.nextInt());
    }
    public static void patternNumberLadder(int totalRows){
        int row=1;
        int count=1;
        while (row<=totalRows){
            for (int col = 1; col <=row ; col++) {
                System.out.print(count+"    ");
                count++;
            }
            System.out.println();
            row++;
        }
    }
}
