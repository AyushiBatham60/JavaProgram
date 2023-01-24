package src.pattern;

import java.util.Scanner;

public class pat11_patternHourGlass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        hourGlass(sc.nextInt());
    }
    public static void hourGlass(int totalRows){
        int Rows=totalRows*2+1;
        int count=totalRows;
        int row=1;
        int col=totalRows;
        int noOfSpaces=0;

        while (row<=Rows){
            int temp=count;
            for (int spaces = 1; spaces <=noOfSpaces ; spaces++) {
                System.out.print(" "+" ");
            }
            for (int column = 1; column <=col ; column++) {
                System.out.print(temp+" ");
                if(column<totalRows){
                    temp--;
                }
                else temp++;
            }
            System.out.print(0+" ");
            for (int column2 = 1; column2 <=col ; column2++) {
                System.out.print(column2+" ");
            }
            if(row<=totalRows){
                count--;
                col--;
                noOfSpaces++;
            }

            else {
                count++;
                col++;
                noOfSpaces--;
            }
            System.out.println();
            row++;
        }
    }
}
