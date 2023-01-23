package src.pattern;

import java.util.Scanner;

public class pat4_withZeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        pat4_withZeros(sc.nextInt());
    }
    public  static  void pat4_withZeros(int totalRows){
        int row=1;
        System.out.println(row);
        row++;
        while (row<=totalRows){
            System.out.print(row+"  ");
            for (int i = 2; i < row; i++) {
                System.out.print("0 ");
            }
            System.out.print(row+"  ");
            System.out.println();
            row++;
        }
    }
}
