package src.String;

import java.util.Scanner;

public class lowerUpper {

    //Print "lowercase" if user enters a character between 'a-z' ,
    // Print "UPPERCASE" is character lies between 'A-Z' and
    // print "Invalid" for all other characters like $,.^# etc.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        lowerUpper(c);
    }
    public static void lowerUpper(char ch){
        int ascii=(int)ch;
        if(ch>96 && ch<124){
            System.out.println("lowercase");
        }
        else if(ch>64 && ch<92){
            System.out.println("UPPERCASE");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
