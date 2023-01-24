package src.pattern;

import java.util.Scanner;

public class pat9_lovesPattern {
    /*
For every odd number row print 1, odd number of times and for every even number row ,
print first and last character as 1 and rest of middle characters as 0.

1
11
111
1001
11111
100001
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        lovesPattern(sc.nextInt());
    }
    public static void lovesPattern(int totalRows){
        int row=1;
        while (row<totalRows){
            for (int col = 1; col <=row; col++) {
                if(row%2==0 &&(col!=1 && col!=row)){
                    System.out.print(0);
                }
                else {
                    System.out.print(1);
                }
            }
            System.out.println();
            row++;
        }
    }
}
